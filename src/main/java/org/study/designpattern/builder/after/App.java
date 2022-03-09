package org.study.designpattern.builder.after;

import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;

/**
 * 사용상 장점
 * 1. night, days 를 같이 세팅하도록 되어 있다. -> 불완적인 객체 생성을 방지 한다.
 * 2. 여행 목적에 따라 인스턴스에서 지원하는 값이 다른 경우 생성자 추가 없이 인스턴스를 만들 수 있다.
 */
public class App {
    public static void main(String[] args) {

        /** Builder Pattern 으로 Instance 생성 */
        // long trip
        TourPlanBuilder builder = new DefaultTourBuilder();
        builder.title("싸이판 여행");
        TourPlan longTrip =  builder.nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .whereToStay("호텔")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "밥먹기")
                .getPlan();
        System.out.println("By Builder: " + longTrip);

        //short trip
        TourPlanBuilder builder1 = new DefaultTourBuilder();
        TourPlan shorTrip =  builder1.title("부산 여행")
                .startDate(LocalDate.of(2022, 12, 24))
                .getPlan();
        System.out.println("By Builder: " +shorTrip);

        /** Director 으로 Instance 생성 */
        // long saipan trip
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan saipanTrip = tourDirector.SaipanTrip();
        // short busan trip
        TourDirector tourDirector1 = new TourDirector(new DefaultTourBuilder());
        TourPlan busanTrip = tourDirector1.BusanTrip();

        System.out.println("By Director: " +saipanTrip);
        System.out.println("By Director: " +busanTrip);


        /** Builder Pattern 으로 Instance 생성 (UpgradeDefaultTourBuilder)*/
        // long trip


        TourPlan longTrip1 =  UpgradeDefaultTourBuilder.newInstance().title("싸이판 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2022, 12, 24))
                .whereToStay("호텔")
                .addPlan(0, "체크인 짐풀기")
                .addPlan(0, "밥먹기")
                .getPlan();
        System.out.println("By new Builder: " +longTrip1);

        //short trip

        TourPlan shorTrip1 =  UpgradeDefaultTourBuilder.newInstance().title("부산 여행")
                .startDate(LocalDate.of(2022, 12, 24))
                .getPlan();
        System.out.println("By new Builder: " +shorTrip1);



    }
}
