import java.util.Scanner;

public class Multipleof3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int a = sc.nextInt();
		
		if (a%3 == 0 && a%5==0) {
			System.out.println(a + " is multiple of 3 and 5");
		}
		else {
			System.out.println( a + " is neither a Multiple of 3 and 5");
		}
		if (a%3 ==0) {
			System.out.println(a + " is multiple of 3");
		}
		else {
			System.out.println( a + " is not a Multiple of 3");
		}
		if (a%5 ==0) {
			System.out.println(a + " is multiple of 5");
		}
		else {
			System.out.println( a + " is not a Multiple of 5");
		}
		sc.close();

	}

}
