import java.util.*;
public class A {
	void display(){
		System.out.println("Parent class");
		}
}

class B extends A{
	void display() throws ArithmeticException {
		System.out.println("Child class");
	}
}
