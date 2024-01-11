package com.kodnest.DemoException;

class ClassNotFoundException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("Demo");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
