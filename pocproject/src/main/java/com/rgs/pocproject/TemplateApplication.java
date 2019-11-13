package com.rgs.pocproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
public class TemplateApplication {

    public static void main(String[] args) {

        SpringApplication.run(TemplateApplication.class, args);

    }

}
