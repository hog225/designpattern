package org.study.designpattern.mediator.after;

import java.time.ZonedDateTime;

public class Hotel {
    public static void main(String[] args) {
        FrontDesk frontDeskMediator = new FrontDesk();
        Guest guest = new Guest(100);
        frontDeskMediator.dinner(guest, ZonedDateTime.now());
        frontDeskMediator.getRestaurant().clean();

        Mediator mediator = new FrontDesk();

        Restaurant restaurant = new Restaurant(mediator);
        restaurant.clean();


    }
}
