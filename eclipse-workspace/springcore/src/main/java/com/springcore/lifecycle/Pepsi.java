package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	private int price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void afterPropertiesSet() throws Exception {
	System.out.println("Hii i am inside interace init");
		
	}

	public void destroy() throws Exception {
		System.out.println("Hii i am inside interace destroy");
		
	}


}
