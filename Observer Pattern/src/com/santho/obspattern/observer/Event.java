package com.santho.obspattern.observer;

import com.santho.obspattern.enm.Events;

@FunctionalInterface
public interface Event {
    void update(Events evn);
}

