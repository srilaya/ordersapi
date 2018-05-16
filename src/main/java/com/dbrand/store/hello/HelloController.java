package com.dbrand.store.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      // spring-mvc annotation
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi! ";
	}
	
}
