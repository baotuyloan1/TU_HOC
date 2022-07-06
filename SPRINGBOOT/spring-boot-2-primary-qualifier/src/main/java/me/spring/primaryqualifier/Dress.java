package me.spring.primaryqualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("dress")
public class Dress implements Outfit {

	public void wear() {
		System.out.println("Dress");
		
	}

}
