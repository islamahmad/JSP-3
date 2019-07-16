package com.islamahmad.data;
import java.util.HashMap;
public class TariffPlan {
    private String name;
    private HashMap<String, Tariff> tariffs;

    public TariffPlan(String name, HashMap<String, Tariff> tariffs) {
        this.name = name;
        this.tariffs = tariffs;
    }

    public TariffPlan(String name) {
        this.name = name;
    }

    public void addTariff(Tariff tariff) {
        if (tariffs == null) {
            tariffs = new HashMap<>();
        }
        tariffs.put(tariff.getName(), tariff);
    }
    public String getName() { return name; }
    public HashMap<String, Tariff> getTariffs() { return tariffs; }
    public void setName(String name) {
        this.name = name;
    }
    public void setTariffs(HashMap<String, Tariff> tariffs) {
        this.tariffs = tariffs;
    }
    @Override
    public String toString() {
        return "TariffPlan{" +
                "name='" + name + '\'' +
                ", tariffs=" + tariffs +
                '}';
    }
}