package org.study.designpattern.builder.advantage;

import org.study.designpattern.builder.before.DetailPlan;

public class DetailPlanBuilder {
    private DetailPlan detailPlan;
    private DetailPlanListBuilder detailPlanListBuilder;

    public DetailPlanBuilder newInstance() {
        this.detailPlan = new DetailPlan();
        return this;
    }

    public DetailPlanBuilder day(int day) {
        this.detailPlan.setDay(day);
        return this;
    }

    public DetailPlanBuilder plan(String plan) {
        this.detailPlan.setPlan(plan);
        return this;
    }

    public void withDetailPlanListBuilder(DetailPlanListBuilder detailPlanListBuilder) {
        this.detailPlanListBuilder = detailPlanListBuilder;
    }

    public DetailPlanListBuilder addDetailPlanToList(){
        this.detailPlanListBuilder.addDetailPlan(this.detailPlan);
        return this.detailPlanListBuilder;
    }

    public DetailPlan getDetailPlan() {
        return this.detailPlan;
    }
}
