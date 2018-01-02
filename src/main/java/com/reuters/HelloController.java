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
	@RequestMapping("/hello2")
	public String hello2(){
		return "hello2";
	}
	//默认使用json返回，Spring boot 默认使用的json解析框架是jackson
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1001);
		demo.setName("Tom");
		return demo;
	}
}
