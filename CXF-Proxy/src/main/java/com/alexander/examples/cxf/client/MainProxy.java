package com.alexander.examples.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alexander.examples.cxf.spring.service.interfaces.HelloWorld;
import com.alexander.examples.cxf.spring.service.interfaces.HelloWorldService;

public class MainProxy {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context 
        = new ClassPathXmlApplicationContext(new String[] {"proxy.xml"});
        
		MainProxy proxy = (MainProxy)context.getBean("clientBean");
		System.out.println(proxy.getHelloClient().sayHi("Booobies"));
//		try {
//			URL wsdlLocation = new URL("http://localhost:8080/CXF-Server-0.0.1-SNAPSHOT/AlexServices/HelloWorld");
//			HelloWorldService service = new HelloWorldService(wsdlLocation);
//			service.getHelloWorldPort().sayHi("Bob Monkhouse");
//		} catch (MalformedURLException mue){
//			System.out.println("Have an exception");
//			mue.printStackTrace();
//		}
	}
	
	private HelloWorld helloClient;
	
	public void setHelloClient(HelloWorld helloClient){
		this.helloClient = helloClient;
	}
	
	public HelloWorld getHelloClient(){
		return this.helloClient;
	}
}
