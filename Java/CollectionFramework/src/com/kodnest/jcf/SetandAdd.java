package com.kodnest.jcf;

import java.util.ArrayList;

class SetandAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cpl = new ArrayList();
		cpl.add("Virat");
		cpl.add("rohit");
		cpl.add("dhoni");
		cpl.add(0, "Sachin");
		System.out.println(cpl);
		
		cpl.set(2, "Sachin");
		System.out.println(cpl);
	}

}
