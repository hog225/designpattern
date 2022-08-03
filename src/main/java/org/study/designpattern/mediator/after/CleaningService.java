package org.study.designpattern.mediator.after;

public class CleaningService {
    // 여기서는 다른 콜리그(Gym, Guest, Restraunt 등을 참조해선 안된다.) 다른 컬리그를 참조하고 싶으면 .. FrontDesk 를 참조한다.
    public void getTowel(int roomNumber, int number) {
        System.out.println(roomNumber + " want " + number + " towel ");
    }

    public void clean(String place) {
        System.out.println(" clean " + place);

    }


}
