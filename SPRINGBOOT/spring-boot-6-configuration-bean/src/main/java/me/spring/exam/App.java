package me.spring.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		DatabaseConnector mysql = (DatabaseConnector) context.getBean("mysqlConnector");
		mysql.connect();

		DatabaseConnector monogodb = (DatabaseConnector) context.getBean("mongodbConnector");
		monogodb.connect();

		DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
		postgresql.connect();
	}

}
