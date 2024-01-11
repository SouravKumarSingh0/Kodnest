package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayList1 {

	public static void main(String[] args) {
		//System.out.println("The size of ArrayList is: "+ a1.size());
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		/*System.out.println("Printing the elements using for loop");
		
		for(int i=0; i<= a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		*/
		
		/*System.out.println("Printing the elements using while loop");
		int j=0;
		 while(j<a1.size()) {
			 System.out.println(a1.get(j)+" ");
			 j++;
		 }
		 */
		
		 System.out.println("Printing the elements using do while loop");
		 int k= 0;
		 do {
			 System.out.println(a1.get(k)+ " ");
			 k++;
		 } while (k < a1.size());
		
		
		System.out.println("Print using Iterator");
		Iterator it = a1.iterator()
;
		while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
	}

}
