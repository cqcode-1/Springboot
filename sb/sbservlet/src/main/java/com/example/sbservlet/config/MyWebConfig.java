package com.example.sbservlet.config;

import com.example.sbservlet.listener.MyListener;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
class MyWebConfig implements WebMvcConfigurer {
   @Bean
   public ServletListenerRegistrationBean getListener(){
      final ServletListenerRegistrationBean<EventListener> bean = new ServletListenerRegistrationBean<>();
      bean.setListener(new MyListener());
      return bean;
   }

   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      WebMvcConfigurer.super.addViewControllers(registry);
      registry.addViewController("/hello1").setViewName("custom");
      registry.addViewController("/login").setViewName("login");
      registry.addViewController("/fragment").setViewName("fragment");
      registry.addViewController("/login.html").setViewName("login");

   }


}
