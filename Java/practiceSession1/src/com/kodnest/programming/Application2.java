package com.kodnest.programming;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User enter first number");
		int num1 = sc.nextInt();
		System.out.println("User enter second number");
	    int num2 = sc.nextInt();
	    
	    
	    Question2 c = new Question2();
	    c.add(num1,num2);
	    c.sub(num1,num2);
	    c.mul(num1,num2);
	    c.quo(num1,num2);
	    c.rem(num1,num2);
	}

}
