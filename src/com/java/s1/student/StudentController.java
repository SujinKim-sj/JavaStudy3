package com.java.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentUtil su = new StudentUtil();
		//su.initUtil();		//초기화
		StudentView sv = new StudentView();
		Student[] students = null;
		Student student = null;
		
		while(check) {
			
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");		
			//switch case 
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("입력");
				students = su.makeStudents();
				break;
			case 2:
				System.out.println("출력");
				if(students != null) {
					sv.view(students);					
				}else {
					sv.view("학생 정보를 먼저 입력하세요");
				}
				break;
			case 3:
				if(students == null) {
					sv.view("검색 결과가 없습니다");
					continue;
				}
				student = su.search(students);

				if(student != null) {
					sv.view(student);											
				}else {
					sv.view("검색 결과가 없습니다");
				}
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			}//switch 끝
			
		}//while 끝
	}//Main 끝
}//class 끝
