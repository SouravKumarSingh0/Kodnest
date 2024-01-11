package com.kodnest.jcf;


class Student{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Student{name: "+name+", age:"+age+"}";
	}
}
class Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student(10, "Sourav");
		Student st1 = new Student(20, "John");
		System.out.println(st);
		System.out.println(st1);
		

	}

}
