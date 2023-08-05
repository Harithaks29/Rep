package com.example.haritha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import security.MyCorsFilter;

import javax.servlet.Filter;

@SpringBootApplication
public class HarithaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarithaApplication.class, args);
	}
	@Bean

    public FilterRegistrationBean myFilter() {

        FilterRegistrationBean registration = new FilterRegistrationBean();

        Filter myFilter = new MyCorsFilter();

        registration.setFilter(myFilter);

        registration.addUrlPatterns("/*");

        registration.setOrder(-1000);

        return registration;

    }

}
