package com.reuters;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 相当于 @controller 和 @requestBody
 * @author u6035457
 *
 */
@RestController
public class HelloController {
	
	//@RequestMapping 建立映射
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

}
