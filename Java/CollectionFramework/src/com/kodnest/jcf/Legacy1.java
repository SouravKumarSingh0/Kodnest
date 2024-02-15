package com.kodnest.jcf;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

class Legacy1 {

	public static void main(String[] args) {
		// Stack
		// Vector
		// HashTable
		// Properties
		// Enumeration
		// Dictionary
		Stack s = new Stack();
		s.add(10);
		s.add(20);
		System.out.println(s);
		
		Vector v = new Vector();
		v.add(50);
		v.add(20);
		System.out.println(v);
		
		Hashtable ht = new Hashtable();
		ht.put(1, 30);
		ht.put(2, 60);
		System.out.println(ht);
		
		
		Properties p = new Properties();
		p.put(1, 70);
		p.put(2, 90);
		System.out.println(p);
		
		

	}

}
