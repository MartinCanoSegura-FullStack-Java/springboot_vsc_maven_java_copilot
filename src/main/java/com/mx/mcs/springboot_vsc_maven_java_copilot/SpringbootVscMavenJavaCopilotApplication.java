package com.mx.mcs.springboot_vsc_maven_java_copilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootVscMavenJavaCopilotApplication {

	public void factorial(int n) {
		int fact = 1;
		if(n < 0) {
			System.out.println("Number should be non-negative.");
		}
		if(n == 0) {
			System.out.println("Factorial of 0 is 1.");
		}
		else {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootVscMavenJavaCopilotApplication.class, args);

		SpringbootVscMavenJavaCopilotApplication app = new SpringbootVscMavenJavaCopilotApplication();
		app.factorial(5);
	}

}
