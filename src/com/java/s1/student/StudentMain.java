package com.java.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentController sc = new StudentController();
		sc.start();
		
		Student student = new Student();
		student.name = "iu";
		student.kor = 10;
		student.eng = 10;
		student.math = 10;
//		student.hello();
//		student.makeTotal();
//		System.out.println("참조변수 student : " + student);
//		System.out.println("Student Total : " + student.total);
//		
//		Student student2 = new Student();
//		student2.kor = 20;
//		student2.eng = 20;
//		student2.math = 20;
//		System.out.println("참조변수 student2 : " + student2);
//		student2.makeTotal();
//		System.out.println("Student2 Total : " + student2.total);
//		
		
		System.out.println("종료");
		
	}
}
