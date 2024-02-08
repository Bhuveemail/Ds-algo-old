package com.facebook;

public class Loop {

	public static void main(String[] args) {
		// what is loop
		/*
		 * loop is repetition
		 * there are three basic loop
		 *     for loop
		 *     while loop
		 *     do loop
		 */
		Loop l = new Loop();
		l.forLoop();
		l.enhenchLoop();
	}
	
	public void forLoop() {
		System.out.println("first loop ");
		for (int i = 0; i < 10; i++) {
			System.out.println("first loop "+i);
		}
		System.out.println("second loop ");
		for (int i = 0; i <= 10; i++) {
			System.out.println("second loop "+i);
		}
		System.out.println("third loop ");
		for (int i = 1; i <= 10; i++) {
			System.out.println("third loop "+i);
		}
		
	}
	
	public void enhenchLoop() {
		String frisName []= {"noor", "tania","sadia", "Tillotama","Zainab","Shirmin"};
		for (String i : frisName) {
			System.out.println(i);
			
		}
	}

}
