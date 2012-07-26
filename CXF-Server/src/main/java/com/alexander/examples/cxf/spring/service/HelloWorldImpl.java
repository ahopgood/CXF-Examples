package com.alexander.examples.cxf.spring.service;

import javax.jws.WebService;

import com.alexander.examples.cxf.spring.service.interfaces.HelloWorld;


@WebService(endpointInterface = "com.alexander.examples.cxf.spring.service.interfaces.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}
}
