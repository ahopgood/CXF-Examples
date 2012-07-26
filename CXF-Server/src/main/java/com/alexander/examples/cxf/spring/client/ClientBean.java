package com.alexander.examples.cxf.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alexander.examples.cxf.spring.service.interfaces.HelloWorld;

public class ClientBean {
	private HelloWorld webservice;
	
	public void setWebservice(HelloWorld helloWorld){
		this.webservice = helloWorld;
	}
	
	public String runWebService(String argument){
		System.out.println("About to call web service");
		return this.webservice.sayHi(argument);
	}
	
	public static void main(String[] args){
        // START SNIPPET: client
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});

        ClientBean client = (ClientBean)context.getBean("clientBean");

        String response = client.runWebService("Joe");
        System.out.println("Response: " + response);
        System.exit(0);
        // END SNIPPET: client
	}
}
