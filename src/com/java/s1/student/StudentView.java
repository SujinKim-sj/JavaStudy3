package com.java.s1.student;

public class StudentView {
	
	//출력 전용
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student[] students) {
		
		for(int i = 0; i < students.length; i++) {
			//Student student = students[i];
			//this.viewStudent(student);
			this.viewStudent(students[i]);
		}
	}
	
	//viewStudent - 학생의 모든 정보를 출력
	public void viewStudent(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);
		System.out.println("국어 점수 : " + student.kor);
		System.out.println("영어 점수 : " + student.eng);
		System.out.println("수학 점수 : " + student.math);
		System.out.println("총점 : " + student.total);
		System.out.println("평균 : " + student.avg);
	
	}
	
	public void viewMessage(String message) {
		//문자열 출력
		System.out.println("-------------------------");
		System.out.println(message);
		System.out.println("-------------------------");
	}

}
