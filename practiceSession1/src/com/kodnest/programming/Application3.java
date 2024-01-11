package com.kodnest.programming;
import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to double");
        int inputNumber = sc.nextInt();

        int doubledNumber = Question3.doubleTheNumber(inputNumber);
        System.out.println("The doubled number is: " + doubledNumber);
	}

}
