package org.study.designpattern.mediator.before;

public class Gym {

    private CleaningService cleaningService = new CleaningService();

    public void clean(){
        cleaningService.clean("GYM");
    }
}
