package com.java.s2.constructor;

public class Car {
	
	String brand;
	String company;
	String color;
	int cc;
	
	//생성자 특수한 메서드
	public Car() {
		this("k9");		//생성자 내에서 첫 줄에 위치해야함
		/*
		this.company = "Kia";
		this.brand = "k9";
		this.color = "black";
		this.cc = 5000;
		*/
	}
	
	public Car(String brand) {
		this(brand, "black");
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = "black";
//		this.cc = 5000;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
	}
	
	public Car(String brand, String color, int cc) {
		this.company = "Kia";
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	//멤버메서드
	public void info() {
		System.out.println("멤버 메서드");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
	
}
