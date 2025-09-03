package com.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// @SpringBootApplication
// public class JenkinstestApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(JenkinstestApplication.class, args);
// 	}

// }

@SpringBootApplication
public class JenkinstestApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinstestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinstestApplication.class, args);
    }
}
