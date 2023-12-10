package com.ah.query.apartowner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("test")
	public void test() {
		System.out.println("test");
	}
}
