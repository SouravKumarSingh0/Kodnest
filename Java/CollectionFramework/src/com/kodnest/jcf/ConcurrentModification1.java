package com.kodnest.jcf;
import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class ConcurrentModification1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fail-safe - because we are unable to see new added element
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		
		/*for (int i=0; i< al.size(); i++) {
			System.out.println(al.get(i));
		}*/
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add(99);
			//20
			// java.util.ConcurrentModificationException shows but if i rename CopyOnWriteArrayList then we didn't get exception
		}
		System.out.println(al);
		
		
		/*LinkedList al2 = new LinkedList();
		//fail-fast - because we are not using concurrent 
		al2.add(20);
		al2.add(30);
		al2.add(40);
		Iterator it1 = al2.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			al2.add(99);
		*/
	}

}
