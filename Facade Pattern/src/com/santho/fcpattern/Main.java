package com.santho.fcpattern;

import com.santho.fcpattern.designs.DeliveryBoy;
import com.santho.fcpattern.designs.DeliveryTeam;
import com.santho.fcpattern.designs.Restaurent;
import com.santho.fcpattern.facade.FoodAppFacade;

public class Main {
    public static void main(String[] args) {
        FoodAppFacade ff = new FoodAppFacade(new Restaurent(), new DeliveryTeam(), new DeliveryBoy());
        ff.placeOrder();
    }
}