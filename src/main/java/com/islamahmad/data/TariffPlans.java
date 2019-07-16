package com.islamahmad.data;
import java.util.HashMap;
public class TariffPlans {
    private static HashMap<String, TariffPlan> tariffPlans = null;
    private TariffPlans() {
        loadTariffPlans();
    }
    public static HashMap<String, TariffPlan> getTariffPlans() {
        if(tariffPlans == null){ loadTariffPlans(); }
        return tariffPlans;
    }
    public static void setTariffPlans(HashMap<String, TariffPlan> tariffPlans) {
        TariffPlans.tariffPlans = tariffPlans;
    }
    private static void loadTariffPlans() {
        tariffPlans = new HashMap<>();
        TariffPlan tp1 = new TariffPlan("tp1",Tariffs.getTariffs());
        TariffPlan tp2 = new TariffPlan("tp2",Tariffs.getTariffs());
        tariffPlans.put(tp1.getName(), tp1);
        tariffPlans.put(tp2.getName(),tp2);
    }
}