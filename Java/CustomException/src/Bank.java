import java.util.*;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount for withdrawl");
		int amount = sc.nextInt();
		try{
			withdraw(amount);
		} catch(MyException e) {
			
		}
	}

	static void withdraw(int amount) throws MyException{
		int balance = 10000;
		if(amount > balance) {
			throw new MyException();
		}
		
	}

}
