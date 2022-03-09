package org.study.designpattern.builder.advantage;

import org.study.designpattern.builder.after.TourPlanBuilder;
import org.study.designpattern.builder.after.UpgradeDefaultTourBuilder;
import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;

/**
 * Builder 를 통해서 동일한 프로세서를 거치지만 다른 인스턴스를 만들 수 있다.
 */
public class App {
    public static void main(String[] args) {
        TourPlanBuilder tourPlanBuilder = UpgradeDefaultTourBuilder.newInstance();
        TourPlan longTrip =  tourPlanBuilder.title("싸이판 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .whereToStay("호텔")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "밥먹기")
                .getPlan();
        System.out.println("By new Builder: " +longTrip);

        tourPlanBuilder = VIPTourBuilder.newInstance();
        TourPlan longVipTrip =  tourPlanBuilder.title("싸이판 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .whereToStay("호텔")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "밥먹기")
                .getPlan();
        System.out.println("By new Builder VIP: " + longVipTrip);


        TourPlan longTrip1 =  TourWithPlanBuilder.newInstance().title("싸이판 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .addDetailPlans()
                    .addDetailPlan().day(0).plan("축구").addDetailPlanToList()
                    .addDetailPlan().day(0).plan("족구").addDetailPlanToList()
                .done()
                .whereToStay("호텔")
                .getPlan();
        System.out.println("By new Builder: " +longTrip1);

    }
}
