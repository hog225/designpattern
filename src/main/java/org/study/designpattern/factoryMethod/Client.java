package org.study.designpattern.factoryMethod;

// 일종의 테스트 코드
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "sdfsf@gmail.com", "jenny");
        client.print(new BlackShipFactory(), "sdfs333f@gmail.com", "ponny");


//        Ship ship = new WhiteShipFactory().orderShip("sldfj@gmail.com", "power");
//        System.out.println(ship);
//        Ship ship2 = new BlackShipFactory().orderShip("sleeeedfj@gmail.com", "nice");
//        System.out.println(ship2);
    }

    void print(ShipFactory shipFactory, String email, String name) {
        System.out.println(shipFactory.orderShip(email, name));
    }
}
