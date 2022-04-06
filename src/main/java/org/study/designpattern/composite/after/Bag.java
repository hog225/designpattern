package org.study.designpattern.composite.after;

import java.util.ArrayList;
import java.util.List;
// Composite
// 리프 타입을 참조하면 안된다.
// bag 과 아이템의 관계는 트리구조다.
public class Bag implements Component{

    List<Component> items = new ArrayList<>();

    public void add(Component component) {
        this.items.add(component);
    }

    public List<Component> getItems() {
        return this.items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Component::getPrice).sum();
    }
}
