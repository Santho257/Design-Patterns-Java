package com.santho.obspattern.observer;

import com.santho.obspattern.enm.Events;

public class EmailEvent implements Event{
    private String email;

    public EmailEvent(String email) {
        this.email = email;
    }

    @Override
    public void update(Events evn) {
        System.out.println("Email sent to: "+ this.email + " about "+evn);
    }
}
