package com.kodnest.programming;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        String result = StringConcatenator.joinStrings(str1, str2);

        System.out.println("Concatenated String: "+ result);

        sc.close();
	}

}
