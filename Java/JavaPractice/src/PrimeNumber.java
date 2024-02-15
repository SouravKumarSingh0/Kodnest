import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		
		int n = sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print("The given no. is Prime Number");
		}
		else {
			System.out.print("Not a prime number");
		}
	}

}
