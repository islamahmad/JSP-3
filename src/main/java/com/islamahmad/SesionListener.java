package com.islamahmad;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class SesionListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {
    public SesionListener() {
        System.out.println("Listener Created");
    }

    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("Context Initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("Context Destroyed");
    }

    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        System.out.println("Session Created");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed");
    }

    public void attributeAdded(HttpSessionBindingEvent sbe) {
        System.out.println("session attribute added named: " + sbe.getName());
        System.out.println("session attribute value: " + sbe.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        System.out.println("session attribute removed named: " + sbe.getName());
        System.out.println("session attribute value: " + sbe.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        System.out.println("session attribute replaced named: " + sbe.getName());
        System.out.println("session attribute value: " + sbe.getValue());
    }
}
