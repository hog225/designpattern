package org.study.designpattern.mediator.after;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
// Concrete Collegue
public class Guest {
    private int roomNumber;
    private FrontDesk frontDesk = new FrontDesk();

    public Guest(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void getTowels(int number) {
        this.frontDesk.getTowels(this, number);
    }

    public void dinner(ZonedDateTime time) {
        this.frontDesk.dinner(this, time);
    }
}
