package com.islamahmad;

import com.islamahmad.data.Privilege;
import com.islamahmad.data.User;
import com.islamahmad.data.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class doLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("In Servlet");
        User u = (User) request.getAttribute("username");
        if (u != null) { // username set
            request.setAttribute("requirement", "");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("landingpage.jsp");
            requestDispatcher.forward(request,response);
            response.sendRedirect("landingpage.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("loginEmail");
        String password = request.getParameter("loginPassword");
        if ((email == null || password == null) || (email.equals("") || password.equals(""))) {
            request.getRequestDispatcher("login.html").forward(request, response);
            response.sendRedirect("login.html");
        }
        HashMap<String, User> users = Users.getUsers();
        User found = users.get(email);
        if (found != null && found.getPassword().equals(password)) {
            request.setAttribute("username", email);
            request.setAttribute("isLoggedIn", true);
            for (Privilege par : found.getPrivileges()) {
                request.setAttribute(par.toString(), par);
            }
        } else {
            request.getRequestDispatcher("login.html").forward(request, response);
            response.sendRedirect("login.html");
        }
    }
}