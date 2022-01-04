package com.java.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]) {}
	
	public Scanner test4() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
	public String test3() {
		//키보드로 부터 이름을 입력 받고 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		
		return name;
	}
	
	public int test2() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Test : " + num);
		return num;
		
	}
	
	public void test1() {
		System.out.println("void는 리턴이 없을 때 사용");
	}
}
