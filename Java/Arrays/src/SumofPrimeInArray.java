import java.util.Scanner;

public class SumofPrimeInArray {
	public static boolean CheckPrime(int num) {
		/*for(int i=2;i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;*/
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		int col = sc.nextInt();
		
		
		int[][] a = {{3, 4, 5,7}, {8, 9, 11, 13}, {21,24,42, 43}};
		System.out.println("The value of "+row+" rows and "+col+" columns are:");
		
		int sum = 0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				if(CheckPrime(a[i][j])) {
					sum = sum + a[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println("Sum of all the prime Numbers present in an array is: "+sum);
		
		
	}

}
