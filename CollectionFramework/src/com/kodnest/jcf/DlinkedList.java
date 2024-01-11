package com.kodnest.jcf;

import java.util.Iterator;
import java.util.LinkedList;

class DlinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a1 = new LinkedList();
		a1.add(20);
		a1.add(30);
		a1.set(0, 76);
		
		LinkedList a2 = new LinkedList();
		a2.add(20.5);
		a2.add(30.9);
		
		LinkedList a3 = new LinkedList();
		a3.addAll(a1);
		a3.addAll(a2);
		
		System.out.println(a3);
		//[76, 30, 20.5, 30.9]
		
		LinkedList a11 = new LinkedList();
		a11.add('h');
		a11.add("56.80");
		a11.set(1, true);
		a11.add(60);
		
		LinkedList a22 = new LinkedList();
		a22.add(4.9);
		a22.add(90);
		a22.set(1, false);
		a22.add("Sourav");
		
		LinkedList a33 = new LinkedList();
		a33.add(a11);
		a33.add(a22);
		
		System.out.println(a33);
		
		//[[h, true, 60], [4.9, false, Sourav]]
		
		LinkedList a5 = new LinkedList();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		a5.add(40);
		a5.add(50);
		
		for(Object o : a5) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//Iterator
		Iterator it = a5.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		
		
	}

}
