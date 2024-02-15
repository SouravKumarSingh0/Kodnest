package com.kodnest.programming;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to convert it into Celcius");
		
		double a = sc.nextDouble();
		
		double celsius = Question6.convertFahrenheitToCelsius(a);
        System.out.println("The result is: " + celsius); 
        sc.close();

	}

}
