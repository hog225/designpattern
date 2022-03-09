package org.study.designpattern.builder.after;

import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;

/**
 * Builder
 */
public interface TourPlanBuilder {
    // TourPlanBuilder 에서 제공하는 메서드를 추가로 사용하기 위해 TourPlanBuilder 를 리턴
    /** buildStepA */
    TourPlanBuilder title(String title);

    /** buildStepB */
    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);
    // 해당 함수를 호출할때 까지 building 가능
    /** getProduct: Product*/
    TourPlan getPlan();


}
