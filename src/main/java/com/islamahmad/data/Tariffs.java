package com.islamahmad.data;
import java.util.HashMap;
public class Tariffs {
    private static HashMap<String, Tariff> tariffs = null;

    private Tariffs() {
        loadTariffs();
    }
    public static HashMap<String, Tariff> getTariffs() {
        if (tariffs == null) {
            loadTariffs();
        }
        return tariffs;
    }

    public static void setTariffs(HashMap<String, Tariff> tariffs) {
        Tariffs.tariffs = tariffs;
    }

    private static void loadTariffs() {
        tariffs = new HashMap<>();
        Tariff tariff1 = new Tariff("tariff1", Billable.LOCAL_SMS, 0.1, 0.15);
        Tariff tariff2 = new Tariff("tariff2", Billable.LOCAL_CALLS, 0.1, 0.15);
        tariffs.put(tariff1.getName(), tariff1);
        tariffs.put(tariff2.getName(), tariff2);
    }
}
