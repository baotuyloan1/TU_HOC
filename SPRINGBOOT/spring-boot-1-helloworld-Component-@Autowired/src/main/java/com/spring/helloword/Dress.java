package com.spring.helloword;

import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit {

	public void wear() {
		System.out.println("Dress");
		
	}

}
