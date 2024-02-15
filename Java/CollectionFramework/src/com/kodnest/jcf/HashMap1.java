package com.kodnest.jcf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap <Integer, String>();
		hm.put(1, "Java");
		hm.put(5, "HTML");
		hm.put(3, "pYTHON");
		hm.put(7, "CSS");
		System.out.println(hm);
		
		System.out.println("\nExample with LinkedHashMap:");
        // Example with LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
       /* 3: Three
        1: One
        2: Two
		*/
        
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1, "java");
        tm.put(5, null);
        tm.put(3, "Python");
        tm.put(7, null);
        System.out.println(tm);
        Set<Integer> keySet = tm.keySet();
        System.out.println(keySet);
        Collection<String> values = tm.values();
        System.out.println(values);

	}

}
