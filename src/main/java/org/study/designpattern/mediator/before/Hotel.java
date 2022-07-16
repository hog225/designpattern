package org.study.designpattern.mediator.before;

public class Hotel {
    public static void main(String[] args) {
        // 객체간의 의존성이 너무 강결합니다.
        Guest guest = new Guest("sonya");
        guest.getTowel(1000);
        guest.dinner();

        Restaurant restrant = new Restaurant();
        restrant.clean();
    }
}
