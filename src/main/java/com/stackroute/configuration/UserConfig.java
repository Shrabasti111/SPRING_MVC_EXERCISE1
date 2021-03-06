package com.stackroute.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @EnableWebMvc
    @Configuration
    @ComponentScan(basePackages = "com.stackroute")
    public class UserConfig {


        @Bean
        public InternalResourceViewResolver viewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("WEB-INF/");
            resolver.setSuffix(".jsp");
            return resolver;
        }

    }


