package org.study.designpattern.builder.advantage;

import org.study.designpattern.builder.before.DetailPlan;
import org.study.designpattern.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.List;

/**
 * 장점: 객체를 만드는데 복잡한 순서가 있다면 빌더 패턴을 통해 순서를 강제 하여 클라이언트 코드에서 쉽게 인스턴스를 만들수 있다.
 */
public class TourWithPlanBuilder {
    private final TourPlan tourPlan;

    protected TourWithPlanBuilder() {
        this.tourPlan = new TourPlan();
    }

    public static TourWithPlanBuilder newInstance() {
        return new TourWithPlanBuilder();
    }

    public TourWithPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    public TourWithPlanBuilder nightAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    public TourWithPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    public TourWithPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    /**
     * DetailPlanListBuilder 를 생성하고 DetailPlanListBuilder 에서 TourWithPlanBuilder 를 사용할 수 있도록 객체를 전달
     * */
    public DetailPlanListBuilder addDetailPlans() {
        DetailPlanListBuilder builder = new DetailPlanListBuilder().newInstance();
        builder.withTourWithPlanBuilder(this);
        return builder;
    }

    public TourWithPlanBuilder plans(List<DetailPlan> plans) {
        this.tourPlan.setDetailPlans(plans);
        return this;
    }



    public TourPlan getPlan() {
        // TourPlan 객체가 유효한 객체인지 확인하는 과정을 추가 할 수 있다.
        return this.tourPlan;
    }
}
