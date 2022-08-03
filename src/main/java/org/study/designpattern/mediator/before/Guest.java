package org.study.designpattern.mediator.before;

import lombok.Data;

@Data
public class Guest {

    private String name;
    private Restaurant restaurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();

    public Guest(String name) {
        this.name =name;
    }

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTowel(int number) {
        cleaningService.getTowel(this.name, number);
    }
}
