package org.study.designpattern.factoryMethod;

public class WhiteShipFactory implements ShipFactory{


    @Override
    public Ship createShip(String email, String name) {
        return new WhiteShip();
    }
}
