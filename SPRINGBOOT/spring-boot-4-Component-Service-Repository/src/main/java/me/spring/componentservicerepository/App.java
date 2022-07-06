package me.spring.componentservicerepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		GirlService girlService = context.getBean(GirlService.class);

		Girl girl = girlService.getRandomGirl();
		System.out.println(girl);

	}

}
