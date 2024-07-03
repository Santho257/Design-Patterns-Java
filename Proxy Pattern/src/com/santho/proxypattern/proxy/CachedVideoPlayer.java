package com.santho.proxypattern.proxy;

import com.santho.proxypattern.design.Video;
import com.santho.proxypattern.design.VideoPlayer;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoPlayer implements VideoPlayer {
    Map<String, Video> videoMap;
    VideoPlayer vp;
    public CachedVideoPlayer(VideoPlayer vp, Map videoMap) {
        this.vp = vp;
        this.videoMap = videoMap;
    }

    @Override
    public Video getVideo(String name) {
        if(!videoMap.containsKey(name)) {
            videoMap.put(name, vp.getVideo(name));
        }
        else{
            System.out.println("Coming from Cache...");
        }
        return videoMap.get(name);
    }
}
