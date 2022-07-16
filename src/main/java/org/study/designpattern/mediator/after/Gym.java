package org.study.designpattern.mediator.after;

public class Gym extends HotelFacility{

    public Gym(Mediator mediator) {
        super(mediator);
    }

    public void clean() {
        super.clean("GYM");
    }
}
