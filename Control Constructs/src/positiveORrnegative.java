import java.util.Scanner;

public class positiveORrnegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		
		int num = sc.nextInt();
		
		/*if (num >0) {       // leader if statement
			System.out.println("Positive");
		}
		if (num< 0) {
			System.out.println("Not Positive");
		}*/
		
		
		if (num >0) {
			System.out.println("Positive");
		}
			else {
				System.out.println("Not positive");
			}

		
		
		sc.close();

	}

}
