package me.spring.componentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import me.spring.componentscan.others.OtherGirl;

//cách 1: chỉ tìm kiếm các bean trong các packets
//@ComponentScan("me.spring.componentscan.others","me.spring.componentscan.others1",..)

//cách 2: chỉ tìm kiếm các bean trong packet others
//@SpringBootApplication(scanBasePackages = "me.spring.componentscan.others")
@SpringBootApplication(scanBasePackages = {"me.spring.componentscan.others","me.spring.componentscan.others1"})

public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		try {
			Girl girl = context.getBean(Girl.class);
			System.out.println("Bean: " + girl.toString());
		} catch (Exception e) {
			System.out.println("Bean Girl không tồn tại");
		}

		try {
			OtherGirl otherGirl = context.getBean(OtherGirl.class);
			System.out.println("Bean: " + otherGirl.toString());
		} catch (Exception e) {
			System.out.println("Bean Other Girl không tồn tại");
		}

	}

}
