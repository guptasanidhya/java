package com.springcore.lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();//for calling destroy it is part of different class
//Samosa s1=(Samosa) context.getBean("s1");
//Pepsi p1=(Pepsi) context.getBean("p1");
//System.out.print(s1);

		Example e1=(Example) context.getBean("e1");
		System.out.print(e1);


	}}