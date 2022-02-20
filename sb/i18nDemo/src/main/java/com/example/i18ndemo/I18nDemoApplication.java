package com.example.i18ndemo;

import com.example.i18ndemo.config.MyLocalResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;

@SpringBootApplication
public class I18nDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nDemoApplication.class, args);
    }


    @Bean
    public LocaleResolver getLocalResolver(){
        return new MyLocalResolver();
    }

}
