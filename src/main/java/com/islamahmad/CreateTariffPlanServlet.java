package com.islamahmad;

import com.islamahmad.data.TariffPlan;
import com.islamahmad.data.TariffPlans;
import com.islamahmad.data.Tariffs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class CreateTariffPlanServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tariffPlanName = request.getParameter("tariffPlanName");
        String[] tariffs = request.getParameterValues("tariffs");
        TariffPlan tp = new TariffPlan(tariffPlanName);
        for (String t : tariffs) { // the value displayed is the name of the tariff which in turn is the key in the hashmap
            tp.addTariff(Tariffs.getTariffs().get(t));
        }
        TariffPlans.getTariffPlans().put(tariffPlanName, tp);
        System.out.println("Tariff plans new size is : " + TariffPlans.getTariffPlans().size());
        request.getRequestDispatcher("landingpage.jsp").forward(request, response);
    }
}