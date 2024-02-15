package com.kodnest.jcf;

import java.util.ArrayList;

class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cpl = new ArrayList();
		cpl.add("Virat");
		cpl.add("rohit");
		cpl.add("dhoni");
		cpl.add("rohit");
		System.out.println(cpl);
		cpl.remove("rohit");
		
		System.out.println(cpl);
		
		cpl.remove(0);
		System.out.println(cpl);
	}

}
