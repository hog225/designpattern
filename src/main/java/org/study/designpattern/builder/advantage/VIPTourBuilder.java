package org.study.designpattern.builder.advantage;

import org.study.designpattern.builder.after.TourPlanBuilder;
import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;

public class VIPTourBuilder implements TourPlanBuilder {
    private TourPlan tourPlan;

    protected VIPTourBuilder() {
        this.tourPlan = new TourPlan();
        // VIP 상품
        this.tourPlan.addPlan(0, "요트 투어 ");
    }

    public static VIPTourBuilder newInstance() {
        return new VIPTourBuilder();
    }


    /** buildStepA */
    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay("5성급 호텔");
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.tourPlan.addPlan(day, plan);
        return this;
    }

    /** getProduct: Product*/
    @Override
    public TourPlan getPlan() {
        // TourPlan 객체가 유효한 객체인지 확인하는 과정을 추가 할 수 있다.
        return this.tourPlan;
    }
}
