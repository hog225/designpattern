package org.study.designpattern.composite.before;

import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        Item knife = new Item("칼", 450);
        Item spear = new Item("창", 50);

        Bag bag = new Bag();
        bag.add(knife);
        bag.add(spear);

        Client client = new Client();
        client.printPrice(knife);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}
