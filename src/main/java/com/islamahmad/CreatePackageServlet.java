package com.islamahmad;

import com.islamahmad.data.Package;
import com.islamahmad.data.Packages;
import com.islamahmad.data.TariffPlan;
import com.islamahmad.data.TariffPlans;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CreatePackageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost in create package");
        String packageName = request.getParameter("packageName");
        String tariffPlan = request.getParameter("tariffPlan");
        String activeFrom = request.getParameter("activeFrom");
        String activeUntil = request.getParameter("activeUntil");
        String discount = request.getParameter("discount");
        System.out.println(activeFrom);
        TariffPlan tp = TariffPlans.getTariffPlans().get(tariffPlan);
        double discountDouble = Double.parseDouble((discount.equals("") ? "0.0" : discount));
        LocalDate activeFromDate = LocalDate.parse(activeFrom, DateTimeFormatter.ISO_DATE);//ofPattern("MM/dd/yyyy"));
        LocalDate activeUntilDate = LocalDate.parse(activeUntil, DateTimeFormatter.ISO_DATE);//ofPattern("MM/dd/yyyy"));
        Package pack;
        if (discountDouble == 0) {
            pack = new Package(packageName, tp, activeFromDate, activeUntilDate);
        } else {
            pack = new Package(packageName, tp, discountDouble, activeFromDate, activeUntilDate);
        }
        Packages.getPackages().put(pack.getName(), pack);
//        System.out.print("Package " + pack.getName() + " created & inserted successfully ");
        System.out.println("current package set size is " + Packages.getPackages().size());
        request.getRequestDispatcher("landingpage.jsp").forward(request, response);
    }
}
