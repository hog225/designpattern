package org.study.designpattern.mediator.after;

import java.time.ZonedDateTime;

public class Restaurant extends HotelFacility{


    public Restaurant(Mediator mediator) {
        super(mediator);
    }

    public void dinner(int roomNumber, ZonedDateTime time) {
        System.out.println(roomNumber + " want " + time + " dinner ");
    }

    public void clean() {
        super.clean("Restaurant");
    }
}
