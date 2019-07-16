package com.islamahmad;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class RequestListener implements ServletRequestListener,
        HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request " + sre.getServletRequest() + " destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request " + sre.getServletRequest() + " initialized");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("attribute " + event.getName() + " added with value " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("attribute " + event.getName() + " with value " + event.getValue() + " was removed");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("attribute " + event.getName() + " with value " + event.getValue() + " was replaced");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Request Session created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Request Session destroyed");
    }
}