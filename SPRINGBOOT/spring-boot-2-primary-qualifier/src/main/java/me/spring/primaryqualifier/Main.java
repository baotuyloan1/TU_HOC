package me.spring.primaryqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("> Trước khi IoC Container được khởi tạo");
		ApplicationContext context = SpringApplication.run(Main.class, args);
		System.out.println("> Sau khi IoC Container được khởi tạo");
		Uniform uniform = context.getBean(Uniform.class);
		Dress dress = context.getBean(Dress.class);
		System.out.println("Instance" + uniform);
		System.out.println("Instance" + dress);
//		uniform.wear();

		Girl girl = context.getBean(Girl.class);
		girl.getOutFit().wear();
		System.out.println(girl.getOutFit());
		System.out.println(girl.getOutFit());
		Girl girl2 = context.getBean(Girl.class);
		System.out.println(girl2);
		System.out.println(girl2.getOutFit());

		System.out.println("===============================");
		System.out.println("> Trước khi IoC Container destroy Girl");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
		System.out.println("> Sau khi IoC Container destroy Girl");
	}

}
