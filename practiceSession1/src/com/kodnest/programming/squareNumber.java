package com.kodnest.programming;
import java.util.Scanner;

public class squareNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the square");
		
		int a = sc.nextInt();
		
		int num = Question8.squareTheNumber(a);
        System.out.println("The square of the number is: " + num);
	}

}
