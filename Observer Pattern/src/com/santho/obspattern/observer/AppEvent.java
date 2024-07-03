package com.santho.obspattern.observer;

import com.santho.obspattern.enm.Events;

public class AppEvent implements Event{
    private String userName;

    public AppEvent(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Events evn) {
        System.out.println("App Notification has sent to: "+ this.userName + " about " + evn);
    }
}
