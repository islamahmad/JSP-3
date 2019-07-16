package com.islamahmad;
import com.islamahmad.data.Billable;
import com.islamahmad.data.Tariff;
import com.islamahmad.data.Tariffs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateTariffServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String tariffName = request.getParameter("tariffName");
        String tariffOffPeak = request.getParameter("tariffOffPeak");
        String tariffPeak = request.getParameter("tariffPeak");
        String billableGroup = request.getParameter("billableGroup");
        double off  = Float.parseFloat(tariffOffPeak);
        double peak = Float.parseFloat(tariffPeak);
        Tariffs.getTariffs().put(tariffName,new Tariff(tariffName,Billable.equivalent(billableGroup),off, peak));
        System.out.println("Tariffs base size is now: " + Tariffs.getTariffs().size());
        request.getRequestDispatcher("landingpage.jsp").forward(request, response);
    }
}
