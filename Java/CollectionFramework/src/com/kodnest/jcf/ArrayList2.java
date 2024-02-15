package com.kodnest.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id+"-"+name;
	}
	
class Sorting implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		if(o1.name.compareTo(o2.name)>0) {
			return -1;
		}
		else if(o1.name.compareTo(o2.name)< 0) {
			return 1;
		}
		return 0;
	}
}

	@Override
	public int compareTo(Student o) {
		if(this.id > o.id){
			return 1;
		}
		else if(this.id < o.id) {
			return -1;
		}
		return 0;
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		Student s1 = new Student (15, "Sourav");
		Student s2 = new Student (15, "Amulya");
		Student s3 = new Student (85, "Super");
		Student s4 = new Student (45, "Thor");
		Student s5 = new Student (95, "IronMan");
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);		
		System.out.println(al);
		Collections.sort(al, new Sorting());
		System.out.println(al);
		

	}

}
