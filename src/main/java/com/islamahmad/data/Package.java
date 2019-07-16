package com.islamahmad.data;
import java.time.LocalDate;

public class Package {
    private String name;
    private TariffPlan plan;
    private double discount;
    private LocalDate activeFrom;
    private LocalDate activeUntil;

    public Package(String name, TariffPlan plan, LocalDate activeFrom, LocalDate activeUntil) {
        this.name = name;
        this.plan = plan;
        this.activeFrom = activeFrom;
        this.activeUntil = activeUntil;
    }

    public Package(String name, TariffPlan plan, double discount, LocalDate activeFrom, LocalDate activeUntil) {
        this.name = name;
        this.plan = plan;
        this.discount = discount;
        this.activeFrom = activeFrom;
        this.activeUntil = activeUntil;
    }
    public void setActiveFrom(LocalDate activeFrom) { this.activeFrom = activeFrom; }
    public void setActiveUntil(LocalDate activeUntil) { this.activeUntil = activeUntil; }
    public Package(String name, TariffPlan plan) { this.name = name;this.plan = plan; }
    public TariffPlan getPlan() { return plan; }
    public String getName() { return name; }
    public double getDiscount() { return discount; }
    public LocalDate getActiveFrom() { return activeFrom; }
    public LocalDate getActiveUntil() { return activeUntil; }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", plan=" + plan +
                ", discount=" + discount +
                ", activeFrom=" + activeFrom +
                ", activeUntil=" + activeUntil +
                '}';
    }
}
