package com.thinkingmamba.firstSpringProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.thinkingmamba.firstSpringProject.scope.PersonDAO;

@SpringBootApplication
public class FirstScopeSpringProjectApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(FirstScopeSpringProjectApplication.class);

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(FirstScopeSpringProjectApplication.class, args);
		PersonDAO personDAO = ctx.getBean(PersonDAO.class);
		PersonDAO personDAO2 = ctx.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
	}
}
