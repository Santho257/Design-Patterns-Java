package com.santho.obspattern.publisher;

import com.santho.obspattern.enm.Events;

public class Store {
    private StoreService ss;
    {
        ss = new StoreService();
    }
    public void newEvent(Events evn){
        ss.notify(evn);
    }

    public StoreService getSs() {
        return ss;
    }
}
