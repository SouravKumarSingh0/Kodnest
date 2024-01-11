package com.kodnest.jcf;

import java.util.*;

class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue a3 = new PriorityQueue();
		a3.add(20);
		a3.add(10);
		a3.add(50);
		a3.add(75);
		System.out.println(a3);
		// [10, 20, 50, 75]
		
		PriorityQueue a4 = new PriorityQueue();
		a4.add('r');
		a4.add('t');
		a4.add('a');
		a4.add('r');
		a4.add('t');
		System.out.println(a4);
		//[a, r, r, t, t]
		
		/*a3.add(10);
		a3.add("git");
		System.out.println(a3);
		//ClassCastException*/
		
		PriorityQueue a5 = new PriorityQueue();
		a5.add(20);
		a5.add(30);
		a5.add(10);
		a5.add(50);
		System.out.println(a5);
		//[10, 30, 20, 50]
		
		
		
	}

}
