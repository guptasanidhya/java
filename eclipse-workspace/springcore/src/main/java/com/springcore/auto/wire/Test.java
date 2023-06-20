package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/auto/wire/autoconfig.xml");
		Emp e1= context.getBean("e1",Emp.class);
		System.out.print(e1);


	}}