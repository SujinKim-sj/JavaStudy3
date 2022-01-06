package com.java.s2.overloading;

public class CountMain {

	public static void main(String[] args) {
		Count count = new Count();
		count.hap(10, 20);
		
		count.hap(10, 1.2);
		System.out.println();
	}

}
