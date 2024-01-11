import java.util.Scanner;
public class PositiveEvenPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else {
            System.out.println(num + " is not a positive number.");
        }

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is not an even number.");
        }
        
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            int maxDivisor = (int) Math.sqrt(num);
            for (int i = 2; i <= maxDivisor; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
	}
}
