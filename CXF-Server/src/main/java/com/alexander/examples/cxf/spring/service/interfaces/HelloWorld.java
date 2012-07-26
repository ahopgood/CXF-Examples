package com.alexander.examples.cxf.spring.service.interfaces;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String sayHi(String text);
}
