package com.kodnest.programming;
import java.util.Scanner;

public class calculateAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate Average");
		
		int sem1 = sc.nextInt();
		int sem2 = sc.nextInt();
		int sem3 = sc.nextInt();
		int sem4 = sc.nextInt();
		int sem5 = sc.nextInt();
		int sem6 = sc.nextInt();
		int sem7 = sc.nextInt();
		int sem8 = sc.nextInt();
		
		double marks = Question7.calculateAverage(sem1,sem2, sem3, sem4, sem5, sem6, sem7, sem8);
        System.out.println("The average marks is: " + marks); 
        sc.close();
		

	}

}
