package com.example.sbservlet;

import com.example.sbservlet.filter.MyFilter;
import com.example.sbservlet.listener.MyListener;
import com.example.sbservlet.ser.MyServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.EventListener;

import javax.servlet.http.HttpSessionListener;

@SpringBootApplication
@ServletComponentScan
public class SbservletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbservletApplication.class, args);
	}

	/**
	 * 代码中的配置优先于@WebServlet中的配置， 这里配置了"/sss"， 会使"/srv"失效
	 * @return ServletRegistrationBean
	 */
	@Bean
	public ServletRegistrationBean getBean(){
		final ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/sss");
		bean.setName("myServlet");
		//设置启动顺序越小越先执行
		bean.setLoadOnStartup(1);
		return bean;
	}

	@Bean
	public FilterRegistrationBean getFilter(){
		final FilterRegistrationBean<MyFilter> filter = new FilterRegistrationBean<>(new MyFilter());
		return filter;
	}

}
