package com.example.i18ndemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
class MyWebConfig implements WebMvcConfigurer {


   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      WebMvcConfigurer.super.addViewControllers(registry);
      registry.addViewController("/hello1").setViewName("custom");
      registry.addViewController("/login").setViewName("login");
      registry.addViewController("/fragment").setViewName("fragment");
      registry.addViewController("/login.html").setViewName("login");

   }


}
