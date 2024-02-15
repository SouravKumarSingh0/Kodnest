package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.TreeSet;

class TreeSet1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(50);
		ts.add(40);
		ts.add(60);
		System.out.println(ts);
		//[10, 20, 30, 40, 50, 60]
		
		TreeSet ts8 = new TreeSet();
		ts8.add(30);
		ts8.add(40);
		ts8.add(10);
		ts8.add(50);
		ts8.add(78);
		System.out.println(ts8);
		//[10, 30, 40, 50, 78] 
		
		TreeSet ts1 = new TreeSet();
		ts1.add("John");
		ts1.add("Jack");
		ts1.add("Riya");
		ts1.add("Sourav");
		ts1.add("Aditya");
		System.out.println(ts1);
		//[Aditya, Jack, John, Riya, Sourav]
		
		
		
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(40);
		
		System.out.println(al);
		//[20, 10, 30, 50, 40]
		
		ArrayList al1 = new ArrayList();
		al1.add('h');
		al1.add(40);
		al1.set(1, 66.80);
		al1.add(60);
		
		ArrayList al2 = new ArrayList();
		al2.add(4.9);
		al2.add(90);
		al2.add("Sourav");
		
		ArrayList al3 = new ArrayList();
		al3.add(al1);
		al3.add(al2);
		System.out.println(al3);
		

	}

}
