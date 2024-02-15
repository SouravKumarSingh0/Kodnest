package com.kodnest.DemoException;

class DemoException {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		int mul = a * b;
		// Exception occurred by executing below operation only.
		int quo = a /b;      
		
		System.out.println(mul);
		System.out.println(quo);
		
		
		/*int[] a = new int[-1]; 
		//Exception occurred because negative size creation of Array can't possible.
		for(int i : a) {
			System.out.println(a[2]);  // Accessing the third element in Array.
		}*/
		
		/*try {
		int a = 5;
		int b = 0;
		int quo = a/b;
		System.out.println(quo);
		}
		catch (Exception e) {
			System.out.println(e);    // get to know the reason why we are getting the exception
			System.out.println("Getting exception because user is trying to divide a number by 0");
			System.out.println("Division by 0");
		}
		*/
		
		try {
			System.out.println(3/0);
			}
		
		catch(Exception e){
			System.out.println("Exception caught");
			try {
				System.out.println(3/0);
				}
			catch(ArithmeticException e1) {
				System.out.println("Nested try catch");
			}
		}
		
		
		
		finally {
			System.out.println("crucial statements to be executed");
		}
		
		
		

	}

}
