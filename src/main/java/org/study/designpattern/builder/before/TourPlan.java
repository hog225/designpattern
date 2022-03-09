package org.study.designpattern.builder.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> detailPlans;

    public TourPlan() {

    }

    // long trip
    public TourPlan(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan> detailPlans) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.detailPlans = detailPlans;
    }

    // short trip
    public TourPlan(String title, LocalDate startDate, List<DetailPlan> detailPlans) {
        this.title = title;
        this.startDate = startDate;
        this.detailPlans = detailPlans;
    }

    public void addPlan(int day, String plan) {
        if (this.detailPlans == null)
            this.detailPlans = new ArrayList<>();
        this.detailPlans.add(new DetailPlan(day, plan));
    }

    public void addPlan(DetailPlan detailPlan) {
        if (this.detailPlans == null)
            this.detailPlans = new ArrayList<>();
        this.detailPlans.add(detailPlan);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public List<DetailPlan> getDetailPlans() {
        return detailPlans;
    }

    public void setDetailPlans(List<DetailPlan> detailPlans) {
        this.detailPlans = detailPlans;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay + '\'' +
                ", detailPlans=" + detailPlans +
                '}';
    }
}
