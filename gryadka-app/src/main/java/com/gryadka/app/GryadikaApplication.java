package com.gryadka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.gryadka"})
public class GryadikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GryadikaApplication.class, args);
	}
}
