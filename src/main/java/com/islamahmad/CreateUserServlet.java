package com.islamahmad;

import com.islamahmad.data.Privilege;
import com.islamahmad.data.User;
import com.islamahmad.data.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("doPost in create user");
        String username = request.getParameter("userame");
        String password = request.getParameter("password");
        String passwordConf = request.getParameter("passwordConf");
        String[] privileges = request.getParameterValues("privileges");
        if (passwordConf.equals(password)) {
            if(username!=null) {
                if (Users.getUsers().get(username) == null) {
                    User u = new User(username, password);
                    for (String p : privileges){
                        u.addPrivilege(Privilege.equivalent(p));
                    }
                    Users.getUsers().put(username, u);
                    System.out.println("New User base size is " + Users.getUsers().size());
                    request.getRequestDispatcher("landingpage.jsp").forward(request, response);
                }
            }
        }
    }
}
