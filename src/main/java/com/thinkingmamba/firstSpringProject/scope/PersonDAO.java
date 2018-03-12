package com.thinkingmamba.firstSpringProject.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {
	@Autowired
	private JDBCConnection jdbcConnection;

	public PersonDAO(JDBCConnection jdbcConnection) {
		super();
		this.jdbcConnection = jdbcConnection;
	}

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}
}
