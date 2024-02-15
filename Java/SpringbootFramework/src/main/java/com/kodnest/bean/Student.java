package com.kodnest.bean;

public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("param Constructor");
	}
	
	public Student() {
		super();
		System.out.println("0-param constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setter id");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setter-name");
	}
	int id;
	String name;
}
