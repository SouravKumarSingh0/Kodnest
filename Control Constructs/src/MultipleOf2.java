import java.util.Scanner;
public class MultipleOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.println(num + " is multiple of 2");
		}
			else {
				System.out.println( num + " is not a Multiple of 2");
			}
		sc.close();
		

	}

}
