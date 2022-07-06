package me.spring.applicationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Value("${bao.mysql.url}")
	private String mysqlUrl;

	@Bean()
	DatabaseConnector mysqlConfigure() {
		DatabaseConnector mysqlConfigure = new MySqlConnector();
		System.out.println("Config mysql URL: " + mysqlUrl);
		mysqlConfigure.setUrl(mysqlUrl);
		return mysqlConfigure;
	}

}
