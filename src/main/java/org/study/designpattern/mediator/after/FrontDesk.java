package org.study.designpattern.mediator.after;


import lombok.Data;

import java.time.ZonedDateTime;

// 모든 컬리그를 알고 있어야 한다.
// Concrete Mediator
@Data
public class FrontDesk implements Mediator {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant(this);

    public void getTowels(Guest guest, int number) {
        // 데이터를 넘길때 CleaningService 에서 다른 컬리그를 참조하도록 넘기면 안된다.
        cleaningService.getTowel(guest.getRoomNumber(), number);
    }

    public void dinner(Guest guest, ZonedDateTime time) {
        restaurant.dinner(guest.getRoomNumber(), time);
    }

    @Override
    public void clean(String place) {
        cleaningService.clean(place);

    }


}
