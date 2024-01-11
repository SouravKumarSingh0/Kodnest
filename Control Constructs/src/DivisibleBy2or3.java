import java.util.Scanner;

public class DivisibleBy2or3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int a = sc.nextInt();
		
		if (a%2 == 0 || a%3==0) {
			System.out.println(a + " is divisible by 2 or 3");
		}
		if (a%2 ==0) {
			System.out.println(a + " is divisible by 2");
		}
		else {
			System.out.println( a + " is not divisible by 2");
		}
		if (a%3 ==0) {
			System.out.println(a + " is divisible by 3");
		}
		
		else {
				System.out.println( a + " is not divisible by 3");
			}
		sc.close();

	}

}
