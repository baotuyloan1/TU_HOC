package me.spring.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.spring.configurationbean.SimpleBean;

@Configuration
public class AppConfig {

	@Bean
	SimpleBean simpleBeanConfigure() {
		return new SimpleBean("Nguyen Duc Bao");
	}

	@Bean("mysqlConnector")
	DatabaseConnector mysqlConfigure() {
		DatabaseConnector mySqlConnector = new MySqlConnector();
		mySqlConnector.setUrl("jdbc:mysql://host:33060/bao");
		// Set username, password, format, v.v...
		return mySqlConnector;
	}

	@Bean("mysqlConnector")
	DatabaseConnector mysqlConfigure(SimpleBean simpleBean) {
		DatabaseConnector mySqlConnector = new MySqlConnector();
		mySqlConnector.setUrl("jdbc:mysql://host:33060/bao");
		// Set username, password, format, v.v...
		return mySqlConnector;
	}

	@Bean("mongodbConnector")
	DatabaseConnector mongodbConfigure() {
		DatabaseConnector mongoDbConnector = new MongoDBConnector();
		mongoDbConnector.setUrl("mongodb:mondodb.example.com/27017/bao");
		// Set username, password, format, v.v...
		return mongoDbConnector;
	}

	@Bean("postgresqlConnector")
	DatabaseConnector postgresqlConfigure() {
		DatabaseConnector postgreSqlConnector = new PostgreSqlConnector();
		postgreSqlConnector.setUrl("postgresql://localhost/bao");
		// Set username, password, format, v.v...
		return postgreSqlConnector;
	}
}
