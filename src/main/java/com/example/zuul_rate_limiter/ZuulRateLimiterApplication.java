package com.example.zuul_rate_limiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulRateLimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRateLimiterApplication.class, args);
	}

}
