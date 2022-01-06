package com.java.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수 선언 = new 생성자 호출
		Car car = new Car();
		//car.brand = "k7";
		//car.company = "kia";
		//car.cc = 2000;
		car.info();
		//car.Car();	error! 생성자는 한번만 호출 가능
		
		Car car2 = new Car("k5");
		car2.info();
		
		Car car3 = new Car("k3", "white");
		car3.info();
		
		Car car4 = new Car("k5", "yellow", 2000);
		car4.info();
		
		Car car5 = new Car("k7", "Red", 5000);
		
	}

}
