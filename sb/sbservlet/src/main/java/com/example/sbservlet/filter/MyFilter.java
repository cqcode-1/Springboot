package com.example.sbservlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/")
public class MyFilter implements Filter {
   @Override
   public void init(FilterConfig filterConfig) throws ServletException {
      System.out.println("--init");
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      System.out.println("--doFilter");
      //这里必须调用此方法
      chain.doFilter(request,response);
   }

   @Override
   public void destroy() {
      System.out.println("--destroy");
   }
}
