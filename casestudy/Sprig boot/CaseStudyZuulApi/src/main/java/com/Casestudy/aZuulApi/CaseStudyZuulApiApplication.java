package com.Casestudy.aZuulApi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@CrossOrigin(origins="http://localhost:4200")
public class CaseStudyZuulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseStudyZuulApiApplication.class, args);
	}

}
