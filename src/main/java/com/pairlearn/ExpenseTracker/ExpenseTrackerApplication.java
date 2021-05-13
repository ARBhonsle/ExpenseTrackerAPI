package com.pairlearn.ExpenseTracker;

import com.pairlearn.ExpenseTracker.exceptions.filters.AuthFilters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<AuthFilters> filterRegistrationBean(){
		FilterRegistrationBean<AuthFilters> registrationBean = new FilterRegistrationBean<>();
		AuthFilters authFilter = new AuthFilters();
		registrationBean.setFilter(authFilter);
		registrationBean.addUrlPatterns("/api/categories/*");
		return registrationBean;
	}
}
