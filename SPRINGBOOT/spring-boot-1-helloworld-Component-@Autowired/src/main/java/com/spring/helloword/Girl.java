package com.spring.helloword;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
	@Qualifier("dress")
	@Autowired
	private Outfit outfit;

//
//	public Uniform getUniform() {
//		return uniform;
//	}
	@Autowired
	public Girl(@Qualifier("uniform") Outfit outfit) {
		this.outfit = outfit;
	}

	public Outfit getOutFit() {
		return outfit;
	}
//	@Qualifier("dress")
//	@Autowired
//	public void setOutFit( Outfit outfit) {
//		this.outfit = outfit;
//	}

//	@Autowired
//	public void setUniform(Uniform uniform) {
//		this.uniform = uniform;
//	}
//	public Girl(Uniform uniform) {
//		this.uniform = uniform;
//	}
//	
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("t>> �?ối tượng Girl sau khi khởi tạo xong sẽ chạy hàm này");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("t>> �?ối tượng Girl trước khi bị destroy thì chạy hàm này");
	}

}
