package com.java.s1.student;

public class StudentView {
	
	//출력 전용
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student[] students) {
		
		for(int i = 0; i < students.length; i++) {
	
			System.out.println("이름 : " + students[i].name);
			System.out.println("번호 : " + students[i].num);
			System.out.println("국어 점수 : " + students[i].kor);
			System.out.println("영어 점수 : " + students[i].eng);
			System.out.println("수학 점수 : " + students[i].math);
		}
	}
	
	//viewStudent - 학생의 모든 정보를 출력
	public void viewStudent(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);
		System.out.println("국어 점수 : " + student.kor);
		System.out.println("영어 점수 : " + student.eng);
		System.out.println("수학 점수 : " + student.math);
	}
	
	public void viewMessage(String message) {
		//문자열 출력
		System.out.println("-------------------------");
		System.out.println(message);
		System.out.println("-------------------------");
	}

}
