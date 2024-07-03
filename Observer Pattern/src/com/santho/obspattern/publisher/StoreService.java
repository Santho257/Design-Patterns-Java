package com.santho.obspattern.publisher;

import com.santho.obspattern.enm.Events;
import com.santho.obspattern.observer.Event;

import java.util.*;

public class StoreService {
    private Map<Events, Set<Event>> subscribers = new HashMap<Events, Set<Event>>();
    {
        Arrays.stream(Events.values()).forEach(event -> {
            subscribers.put(event, new HashSet<Event>());
        });
    }

    public void subscribe(Events evn, Event user){
        subscribers.get(evn).add(user);
    }
    public void unsubscribe(Events evn, Event user){
        subscribers.get(evn).remove(user);
    }

    public void notify(Events evn) {
        subscribers.get(evn).forEach(user -> user.update(evn));
    }
}
