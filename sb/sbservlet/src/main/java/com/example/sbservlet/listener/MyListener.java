package com.example.sbservlet.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class MyListener implements HttpSessionListener {
    public static int count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        System.out.println("count+:"+count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session destroy:"+count);
    }
}
