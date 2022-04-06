package org.study.designpattern.composite.after;

// Client 는 Component 를 본다.
// type의 variable 은 가능한 추상적이게
// Composite 패턴의 목표는 client 입장에서 하이라키에 관련없이 동일한 코드로 결과를 얻기 위함 이다.
public class Client{

    public static void main(String [] args ) {
        Item item = new Item("칼", 500);
        Item item1 = new Item("창", 1000);

        Bag bag = new Bag();
        bag.add(item);
        bag.add(item1);
        Client client = new Client();

        System.out.println(client.getPrice(bag));
        System.out.println(client.getPrice(item));


    }

    private int getPrice(Component component) {
        return component.getPrice();
    }





}
