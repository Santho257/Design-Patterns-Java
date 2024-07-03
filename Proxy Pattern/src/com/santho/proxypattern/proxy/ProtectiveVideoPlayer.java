package com.santho.proxypattern.proxy;

import com.santho.proxypattern.design.Video;
import com.santho.proxypattern.design.VideoPlayer;

public class ProtectiveVideoPlayer implements VideoPlayer {
    int age;
    VideoPlayer vp;
    public ProtectiveVideoPlayer(int age, VideoPlayer vp) {
        this.age = age;
        this.vp = vp;
    }

    @Override
    public Video getVideo(String name) throws UnsupportedOperationException {
        Video vid = vp.getVideo(name);
        if(vid.isAgeRestricted() && this.age < 18) {
            throw new UnsupportedOperationException("You are not allowed to watch this video!! AGE: " + age);
        }
        return vid;
    }
}
