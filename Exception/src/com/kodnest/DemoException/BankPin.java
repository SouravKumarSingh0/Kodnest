
package com.kodnest.DemoException;
import java.util.Scanner;
public class BankPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int oriPin = 1234;
		int balance = 15000;
		int pin = 0;
		
		 Scanner sc = new Scanner(System.in);
			try {
			pin = sc.nextInt();
			}
			
			catch (Exception e) {
				System.out.println("Pleasee enter valid no.");
			}
			if(pin==oriPin) {
				System.out.println("Balance :"+balance);
			}
			
			
			
				System.out.println("Please enter valid numbers only");
		}

}
