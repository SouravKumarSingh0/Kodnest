package com.kodnest.jcf;
//ctrl+ shift+O , remove unused import and add used import
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(50);
		al.add(50);
		
		System.out.println(al);
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
		//[10, 30, 20, 50, 50]
		//[10, 20, 30, 50]
		
		
		Collections.sort(al);
		System.out.println(al);
		//[10, 20, 30, 50, 50]


	}

}
