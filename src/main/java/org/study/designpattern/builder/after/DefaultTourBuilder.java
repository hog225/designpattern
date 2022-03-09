package org.study.designpattern.builder.after;

import org.study.designpattern.builder.before.DetailPlan;
import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteBuilderA
 */
public class DefaultTourBuilder implements TourPlanBuilder {

    // 변수명을 그대로 쓰기 싫다면 UpgradeDefaultTourBuilder 참조
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> detailPlans;

    /** buildStepA */
    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay =whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.detailPlans == null)
            this.detailPlans = new ArrayList<>();
        this.detailPlans.add(new DetailPlan(day, plan));
        return this;
    }

    /** getProduct: Product*/
    @Override
    public TourPlan getPlan() {
        // TourPlan 객체가 유효한 객체인지 확인하는 과정을 추가 할 수 있다.
        return new TourPlan(title, nights, days, startDate, whereToStay, detailPlans);
    }
}
