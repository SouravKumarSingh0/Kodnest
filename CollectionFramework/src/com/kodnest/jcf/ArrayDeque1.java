package com.kodnest.jcf;

import java.util.ArrayDeque;

class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		a.add(20);
		a.add(30);
		a.add(40);
		a.addFirst(60);
		a.addLast(78);
		a.add(50);
		System.out.println(a);
		//
		
		ArrayDeque b = new ArrayDeque();
		b.add('h');
		b.add("true");
		b.add(60);
		
		ArrayDeque c = new ArrayDeque();
		c.add(4.9);
		c.add("false");
		c.remove("Sourav");
		c.addLast(true);
		
		ArrayDeque d = new ArrayDeque();
		d.addFirst(b);
		d.addLast(c);
		
		System.out.println(c);

	}

}
