package com.islamahmad;

import com.islamahmad.data.Privilege;
import com.islamahmad.data.User;
import com.islamahmad.data.Users;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.HashMap;

@WebFilter(filterName = "LoggedInFilter")
public class LoggedInFilter implements Filter {
    private HashMap<String, User> users = null;
    public void destroy() {
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("In Logged In Filter");
        String email = req.getParameter("loginEmail");
        String password = req.getParameter("loginPassword");
        if ((email == null || password == null) || (email.equals("") || password.equals(""))) {
            resp.getWriter().print("email or password cannot be empty");
        }
        User found = this.users.get(email);
        if (found != null && found.getPassword().equals(password)) {
//            req.setAttribute("privileges",users.get(found).getPrivileges());
            for (Privilege par : found.getPrivileges()) {
                req.setAttribute(par.toString(), par);
            }
            req.setAttribute("username", email);
            req.setAttribute("isLoggedIn", true);
            //just logged in
            if (req.getAttribute("requirement") == null) {
                req.setAttribute("requirement", "");
            }
//            req.setAttribute("requirement", "");
            if (req.getAttribute("requirement").equals("")) {
                req.getRequestDispatcher("landingpage.jsp").forward(req, resp);
            }else if(req.getAttribute("requirement").equals("createTariff")){
                System.out.println("found requirement = createTariff");
                req.getRequestDispatcher("tariff.jsp").forward(req, resp);
            }else if(req.getAttribute("requirement").equals("createTariffPlan")){
                req.getRequestDispatcher("tariffPlan.jsp").forward(req, resp);
            }else if(req.getAttribute("requirement").equals("createPackage")){
                req.getRequestDispatcher("package.jsp").forward(req, resp);
            }else if(req.getAttribute("requirement").equals("createUser")){
                req.getRequestDispatcher("user.jsp").forward(req, resp);
            }
        }

    }

    public void init(FilterConfig config)  {
        this.users = Users.getUsers();
    }
}
