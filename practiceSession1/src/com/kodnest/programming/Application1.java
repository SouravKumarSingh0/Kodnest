package com.kodnest.programming;

import java.util.Scanner;

public class Application1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l1 = sc.nextLong();
	    System.out.println("User enter first number");
	    
	    long l2 = sc.nextLong();
	    System.out.println("User enter second number");
	    
	    Question1 q1 = new Question1();
	    long result = q1.galacticAddition(l1,l2);
	    
	    System.out.println("The result ="+ result);
	}
}
