package org.study.designpattern.builder.after;


import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;

/**
 * Director
 * Builder 패턴으로 인스턴스를 만드는데 동일한 패턴으로 만들어야될 경우가 많다면 Director 사용
 * 예를 들면 Long Tirip을 만들어야 될 케이스가 많은 경우
 *
 * 장점: 복잡한 객체를 만드는 과정을 숨길 수 있다.
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    // builder 를 주입
    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan SaipanTrip() {
        return this.tourPlanBuilder.title("싸이판 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .whereToStay("호텔")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "밥먹기")
                .getPlan();

    }

    public TourPlan BusanTrip() {
        return this.tourPlanBuilder.title("부산 여행")
                .startDate(LocalDate.of(2022, 12, 24))
                .getPlan();

    }
}
