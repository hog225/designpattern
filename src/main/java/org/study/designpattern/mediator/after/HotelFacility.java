package org.study.designpattern.mediator.after;

public class HotelFacility {

    Mediator mediator;

    public HotelFacility(Mediator mediator) {
        this.mediator = mediator;
    }


    public void clean(String place) {
        mediator.clean(place);
    }
}
