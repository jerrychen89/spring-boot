package com.smartdot.grc.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	
//	@Value("${test.property}")
	private  String test;
//	@Value("${user.property}")
	private  String user;
	
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World! You are my "+test;
	}
	
	@RequestMapping("/test")
	@ResponseBody
	String test(){
		return "Hello Test! You are my "+user;
	}
	
	@RequestMapping("/hello")
	String hello(){
		return "hello";
	}
	/** 封闭main方法**/
	public static void main(String[] args) throws Exception{
		SpringApplication.run(HelloWorldController.class, args);
	}
	
}
