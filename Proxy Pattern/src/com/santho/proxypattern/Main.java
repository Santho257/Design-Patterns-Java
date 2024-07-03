package com.santho.proxypattern;

import com.santho.proxypattern.design.TrueVideoPlayer;
import com.santho.proxypattern.design.Video;
import com.santho.proxypattern.design.VideoPlayer;
import com.santho.proxypattern.proxy.CachedVideoPlayer;
import com.santho.proxypattern.proxy.ProtectiveVideoPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Video> vm = new HashMap<String, Video>();
        vm.put("closer", new Video("closer"));
        vm.put("killing-secrets", new Video("killing-secrets", true));
        vm.put("homie5", new Video("homie5"));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();in.nextLine();
        char choice;
        do {
            System.out.print("Enter the Video Name: ");
            String vid = in.nextLine();
            VideoPlayer vp = new ProtectiveVideoPlayer(age, new CachedVideoPlayer(new TrueVideoPlayer(), vm));
            try {
                Video yt = vp.getVideo(vid);
                yt.playVideo();
            } catch (UnsupportedOperationException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.print("Enter y/Y to Watch More Videos: ");
            choice = in.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}