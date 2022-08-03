package org.study.designpattern.mediator.before;

public class CleaningService {

    public void clean(String place) {
        System.out.println(place + " + 청소중 !!!" );
    }

    public void getTowel(String name, int number) {
        System.out.println(" give towel to guest " + name + " number " + number);
    }
}
