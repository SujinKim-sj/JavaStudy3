package com.java.s1.student;

public class Student {
	
	//Data 저장 용도
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		int total = 0;					//지역변수
		//System.out.println("참조변수 this");
		//System.out.println("참조변수 this : " + this);
		//this.total = this.kor + this.eng + this.math;
		this.total = kor + eng + math;	// this 생략 가능, 지역변수와 멤버변수 구별하기 위해 this 사용
		//평균 계산
		this.avg = this.total / 3.0; 
	}
	
	public void hello() {
		System.out.println("hello");
		
	}
}
