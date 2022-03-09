package org.study.designpattern.builder.advantage;

import org.study.designpattern.builder.after.TourPlanBuilder;
import org.study.designpattern.builder.before.DetailPlan;

import java.util.ArrayList;
import java.util.List;

public class DetailPlanListBuilder {
    private TourWithPlanBuilder tourWithPlanBuilder;
    private List<DetailPlan> detailPlanList;

    public DetailPlanListBuilder newInstance() {

        this.detailPlanList = new ArrayList<>();
        return this;
    }

    public DetailPlanListBuilder addDetailPlan(DetailPlan detailPlan) {
        this.detailPlanList.add(detailPlan);
        return this;
    }

    /**
     * DetailPlanBuilder 를 생성하고 DetailPlanBuilder 에서 DetailPlanListBuilder 를 사용할 수 있도록 객체를 전달
     * */
    public DetailPlanBuilder addDetailPlan() {
        DetailPlanBuilder detailPlanBuilder = new DetailPlanBuilder().newInstance();
        detailPlanBuilder.withDetailPlanListBuilder(this);
        return detailPlanBuilder;
    }

    /**
     * TourWithPlanBuilder.plans 를 이용하여 TourPlan에 detailPlanList 를 세팅
     * DetailPlanList 를 Build 한 후에서 TourWithPlanBuilder 에서 Building 을 이어갈 수 있도록 TourWithPlanBuilder 리턴
     * */
    public TourWithPlanBuilder done() {
        this.tourWithPlanBuilder.plans(this.build());
        return this.tourWithPlanBuilder;
    }

    /**
     * TourWithPlanBuilder 를 받아서 맴버 변수에 할당
     * */
    public void withTourWithPlanBuilder(TourWithPlanBuilder tourWithPlanBuilder) {
        this.tourWithPlanBuilder = tourWithPlanBuilder;
    }

    public List<DetailPlan> build() {
        return this.detailPlanList;
    }




}
