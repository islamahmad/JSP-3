package com.islamahmad;

import com.islamahmad.data.Privilege;
import com.islamahmad.data.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "PrivilegeFilter")
public class PrivilegeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) {
//        chain.doFilter(req, resp);
        User u = (User) req.getAttribute("username");
        List<Privilege> privs = new ArrayList<>(u.getPrivileges());
    }

    public void init(FilterConfig config) {

    }

}
