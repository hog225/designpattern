package org.study.designpattern.builder.after;

import org.study.designpattern.builder.before.DetailPlan;
import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteBuilderA
 */
public class UpgradeDefaultTourBuilder implements TourPlanBuilder {

    private TourPlan tourPlan;

    protected UpgradeDefaultTourBuilder() {
        this.tourPlan = new TourPlan();
    }

    public static UpgradeDefaultTourBuilder newInstance() {
        return new UpgradeDefaultTourBuilder();
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
        this.tourPlan.setWhereToStay(whereToStay);
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
