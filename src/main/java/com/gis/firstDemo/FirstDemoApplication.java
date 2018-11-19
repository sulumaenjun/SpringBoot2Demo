package com.gis.firstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.gis.firstDemo.web.servlet")
public class FirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDemoApplication.class, args);
	}
}
