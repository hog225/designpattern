package org.study.designpattern.builder.before;

import java.time.LocalDate;

/**
 * 이런식으로 인스턴스를 만들때 문제점
 * 1. night, days 를 같이 세팅하도록 강제할 수 없음으로 불완전한 객체가 생성될 가능성이 있다.
 * 2. 여행 목적에 따라 인스턴스에서 지원하는 값이 다른 경우 생성자를 여러개 생성해야 한다. 혹은 AllArgConstructor 에 수많은 null 값을 넣어야 한다.
 */
public class App {
    public static void main(String[] args) {

        // Short Trip
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("부산 여행");
        shortTrip.setStartDate(LocalDate.of(2022, 7, 20));

        // Long Trip
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("싸이판 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 12, 9));
        tourPlan.setWhereToStay("호텔");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "석식");
        tourPlan.addPlan(1, "조식 뷔페에서 식사");
        tourPlan.addPlan(1, "점심");
        tourPlan.addPlan(1, "저녘");
        tourPlan.addPlan(2, "체크아웃");


        // Short Trip
        TourPlan shortTrip1 = new TourPlan("부산여행", LocalDate.of(2022, 7, 20), null);
        // long Trip
        TourPlan shortTrip2 = new TourPlan(
                "싸이판 여행",
                2,
                3,
                LocalDate.of(2022, 7, 20),
                "호텔",
                null // 할일 리스트
        );
        // long trip no where to stay ??
    }
}
