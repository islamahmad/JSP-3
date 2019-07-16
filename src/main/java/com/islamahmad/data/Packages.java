package com.islamahmad.data;
import java.time.LocalDate;
import java.util.HashMap;
public class Packages {
    private static HashMap<String,Package> packages = null;
    private Packages() {
        loadPacakges(); 
    }
    public static HashMap<String, Package> getPackages() {
        if(packages==null){ loadPacakges(); }
        return packages;
    }

    public static void setPackages(HashMap<String, Package> packages) {
        Packages.packages = packages;
    }
    private static void loadPacakges() {
        packages = new HashMap<>();
        LocalDate dateFrom = LocalDate.now();
        LocalDate dateTo = LocalDate.now().plusDays(30);
        Package aPack = new Package("pack01",TariffPlans.getTariffPlans().get("tp1"),0,dateFrom, dateTo);
        Package secPack = new Package("pack02",TariffPlans.getTariffPlans().get("tp2"),0.5,dateFrom, dateTo);
        packages.put(aPack.getName(),aPack);
        packages.put(secPack.getName(),secPack);
    }
}
