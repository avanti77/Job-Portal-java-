package com.aman.joblisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.aman.joblisting.controller", "com.aman.joblisting.model", "com.aman.joblisting.repository"})
public class JoblistingApplication {
	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}
}
