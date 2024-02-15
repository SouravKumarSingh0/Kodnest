package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.kodnest.bean.Student;
public class App {
	public static void main(String[] args) {
		System.out.println("Spring boot");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Student s = (Student) context.getBean("s1");
		System.out.println(s);
		
		Student k = (Student) context.getBean("s2");
		System.out.println(k);
		
		Student j = (Student) context.getBean("s3");
		System.out.println(j);
		
	}
}
