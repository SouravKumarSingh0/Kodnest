package com.kodnest.programming;

public class MathSolution {

	public static void main(String[] args) {
		double d = Math.PI;
		System.out.printf("%.2f",d);// format specifier
		System.out.println("");
		System.out.printf("%2f",d);
		System.out.println("");
		System.out.println(Math.PI);
		System.out.println((float)Math.PI);  // type casting 
		
		float f = 3.447896746546353f;
		System.out.printf("%.3f",f);  // concept is same for float and double 
		System.out.println("");
		int s = 40;
		System.out.printf("%d",s);  // %f is for float & double
		
		char c ='S';
		System.out.printf("%C", c);
		
		String k = "Sourav";
		System.out.printf("%s",k);   // % s for string 
	}

}
