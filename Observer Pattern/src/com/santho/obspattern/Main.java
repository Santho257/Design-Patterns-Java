package com.santho.obspattern;

import com.santho.obspattern.enm.Events;
import com.santho.obspattern.observer.AppEvent;
import com.santho.obspattern.observer.EmailEvent;
import com.santho.obspattern.publisher.Store;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Store newStore = new Store();

        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new EmailEvent("abc@xyz.com"));
        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new AppEvent("abc123"));
        newStore.getSs().subscribe(Events.SALE, new AppEvent("abc123"));
        newStore.getSs().subscribe(Events.SALE, new EmailEvent("mno@pqr.com"));
        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new EmailEvent("mno@pqr.com"));
        newStore.getSs().subscribe(Events.SALE, new AppEvent("mno122"));

        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new EmailEvent("abc@xz.com"));
        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new AppEvent("abc13"));
        newStore.getSs().subscribe(Events.SALE, new AppEvent("abc12"));
        newStore.getSs().subscribe(Events.SALE, new EmailEvent("mn@pqr.com"));
        newStore.getSs().subscribe(Events.STOCK_RECOVERY, new EmailEvent("mno@pq.com"));
        newStore.getSs().subscribe(Events.SALE, new AppEvent("mno127"));

        Thread t1 = new Thread(()->newStore.newEvent(Events.STOCK_RECOVERY));
        Thread t2= new Thread(()->newStore.newEvent(Events.SALE));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\nSent Notifications Successfully!!!");
    }
}