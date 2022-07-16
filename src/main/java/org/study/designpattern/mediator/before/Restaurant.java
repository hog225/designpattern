package org.study.designpattern.mediator.before;

public class Restaurant {

    private CleaningService cleaningService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println(guest.getName() + " want dinner ");
    }

    public void clean() {
        cleaningService.clean("Restaurant");
    }
}
