package com.java.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		System.out.println("Conflict Test");
		System.out.println("GitHub Write");
			
		//객체 생성 코드
		//new 클래스명();
		ReturnStudy rs = new ReturnStudy();
		
		//참조변수명.멤버들
		rs.test1();
		int num = rs.test2();
		System.out.println("Main : " + num);
		
		String name = rs.test3();
		System.out.println(name);
		
		double num2 = Math.random();
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("age : " + age);
		System.out.println("Math.random : " + num2);
		System.out.println("MainMethod Finish");
		
	}	

}
