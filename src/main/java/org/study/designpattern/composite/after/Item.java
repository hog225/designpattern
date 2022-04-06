package org.study.designpattern.composite.after;

// Leaf
public class Item implements Component{
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public int getPrice() {
        return this.price;
    }
}
