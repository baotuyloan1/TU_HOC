package com.spring.helloword;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("uniform")
public class Uniform implements Outfit {
	public void wear() {
		System.out.println("Casual clothes");
	}

}
