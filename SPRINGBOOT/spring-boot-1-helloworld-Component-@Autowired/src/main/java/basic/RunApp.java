package basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunApp {

	public static void main(String[] args) {
		// ApplicationCOntext chứa toàn bộ dependency trong project
		ApplicationContext context = SpringApplication.run(RunApp.class, args);
	}

}
