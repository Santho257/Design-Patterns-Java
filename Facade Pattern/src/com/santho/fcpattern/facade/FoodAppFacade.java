package com.santho.fcpattern.facade;

import com.santho.fcpattern.designs.DeliveryBoy;
import com.santho.fcpattern.designs.DeliveryTeam;
import com.santho.fcpattern.designs.Restaurent;

public class FoodAppFacade {
    private Restaurent res;
    private DeliveryTeam dt;
    private DeliveryBoy db;

    public FoodAppFacade(Restaurent res, DeliveryTeam dt, DeliveryBoy db) {
        this.res = res;
        this.dt = dt;
        this.db = db;
    }

    public void placeOrder(){
        res.prepareOrder();
        dt.assignDeliveryBoy();
        db.pickUpOrder();
        db.deliverOrder();
    }
}
