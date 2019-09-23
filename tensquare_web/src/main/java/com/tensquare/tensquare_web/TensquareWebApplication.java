package com.tensquare.tensquare_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TensquareWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TensquareWebApplication.class, args);
	}

}
