package com.kodnest.programming;
import java.util.Scanner;

public class cubeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the cube");
		
		int a = sc.nextInt();
		
		int num = Question9.cubeTheNumber(a);
        System.out.println("The cube of the number is: " + num);

	}

}
