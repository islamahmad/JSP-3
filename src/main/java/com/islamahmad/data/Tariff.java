package com.islamahmad.data;
//immutable calss

import java.util.Arrays;

public class Tariff {
    final private int[] offPeakHours = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    final private int[] onPeakHours = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
    private String name;
    private Billable chargeBase;
    private double offPeakCost;
    private double onPeakCost;

    public Tariff(String name, Billable chargeBase, double offPeakCost, double onPeakCost) {
        this.name = name;
        this.chargeBase = chargeBase;
        this.offPeakCost = offPeakCost;
        this.onPeakCost = onPeakCost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getOffPeakCost() {
        return offPeakCost;
    }
    public double getOnPeakCost() {
        return onPeakCost;
    }
    public void setChargeBase(Billable chargeBase) {
        this.chargeBase = chargeBase;
    }
    public Billable getChargeBase() {
        return chargeBase;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", chargeBase=" + chargeBase +
                ", offPeakCost=" + offPeakCost +
                ", onPeakCost=" + onPeakCost +
                ", offPeakHours=" + Arrays.toString(offPeakHours) +
                ", onPeakHours=" + Arrays.toString(onPeakHours) +
                '}';
    }
}