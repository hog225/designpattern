package org.study.designpattern.factoryMethod;

public class BlackShipFactory implements ShipFactory{


    @Override
    public Ship createShip(String email, String name) {
        return new BlackShip();
    }
}
