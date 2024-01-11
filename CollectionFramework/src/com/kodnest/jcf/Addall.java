package com.kodnest.jcf;

import java.util.ArrayList;

class Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cpl = new ArrayList();
		cpl.add("Virat");
		cpl.add("rohit");
		cpl.add("dhoni");
		cpl.add("Sachin");
		
		ArrayList fpl = new ArrayList();
		fpl.add("Ronaldo");
		fpl.add("Messi");
		
		System.out.println(cpl);
		System.out.println(fpl);
		
		ArrayList player = new ArrayList();
		player.addAll(cpl);
		player.addAll(fpl);
		System.out.println(player);

	}

}
