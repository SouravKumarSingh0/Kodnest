package com.kodnest.DemoException;

class DemoException1 {

	public static void main(String[] args) {
		System.out.println("main-start");
		method1();
		System.out.println("main-stop");
		
	}

	private static void method1() {
		System.out.println("method-1 start");
		method2();
		System.out.println("method-1 stop");
		
	}

	private static void method2() {
		System.out.println("method-2 start");
		try {
		method3();
		} catch (Exception e) {
		System.out.println("Exception caught");
		}
		System.out.println("method-2 stop");
	}

	private static void method3() {
		
		System.out.println("method-3 start");
		System.out.println(3/0);
		System.out.println("method-3 stop");
		
	}

}
