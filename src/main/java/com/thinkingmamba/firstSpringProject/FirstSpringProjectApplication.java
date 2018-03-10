package com.thinkingmamba.firstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstSpringProjectApplication.class, args);
		ComplexBusinessService service = (ComplexBusinessService) ctx.getBean("complexBusinessService");
		service.sort();
	}
}
