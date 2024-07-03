package com.santho.proxypattern.design;

public class TrueVideoPlayer implements VideoPlayer{
    @Override
    public Video getVideo(String name) {
        System.out.println("Video is getting from Internet");
        try {
            Thread.sleep((long) (1000+Math.random()*500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Video(name);
    }
}
