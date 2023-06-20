package com.springcore.lifecycle;

public class Samosa {
private int price;

public Samosa(int price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

public void init() {
System.out.println("Inside Init");
}

public void destroy() {
	System.out.println("inside destroy bye bye");
}

}

