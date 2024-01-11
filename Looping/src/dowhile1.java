import java.util.Scanner;
public class dowhile1 {

	private static int rem;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		//Not printing 5 between the no. 1 to 10
		/*int i = 1;
		do {
			if (i==5) {
				
			}
			else {
				System.out.print(i);
			}
			i++;
		}while (i<=10);*/
		
		//Increasing the number by 1
		/*int i =1;
		while(i<=n) {
			System.out.println(i);
				i++;
		}*/
		
		
		//Multiplication Table
	/*	int i=1;
		while(i<=10) {
			System.out.println(n+"*"+i+" = "+n*i);
			i++;
			
		}*/
		
		
		// factorial of n
		/*int prod = 1;
		for(int i=n;i>=1;i--) {
			prod = prod*i;
		}
		System.out.print(prod);*/
		
		
		// check no. is prime or not
		/*int count=0;
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
		}*/
		
		// sum of given number
		/*int sum =0;
		while(n>0) {
			int rem = n% 10;
			sum = sum+rem;
			//int quot = n/10;
			//n=quot;
			n=n/10;
		}
		System.out.print(sum);*/
		
		
		//Fibonaci series
	/*	int num1 = 0;
		int num2 =1;
		if(n==1) {
			System.out.print(num1);
		}
		else if(n==2) {
			System.out.print(num2);
		}
		else {
			for(int i=3;i<=n;i++) {
				int num3=num1+num2;
				System.out.print(num3+",");
				num1= num2;
				num2= num3;
			}
		}*/
		
		    // First 'n' prime Numbers
		     /*  int count = 0;
		        int num = 2;

		        while (count < n) {
		            int i = 2;
		            while (i <= num) {
		                if (i == num) {
		                    System.out.print(num + " ");
		                    count++;
		                    break;
		                }
		                if (num % i == 0) {
		                    break;
		                }
		                i++;
		            }
		            num++;
		        }*/
		
		
		// Find Greatest Common Divisor of 2 no.
		/*int num2 = sc.nextInt();
		int result = Math.min(n, num2); 
        while (result > 0) { 
            if (n % result == 0 && num2 % result == 0) { 
                break; 
            } 
            result--; 
        }
        System.out.print(result);
        */
		        
		     
		// to check Palindrome number or not
        /*int originalNumber = n;
        int reversedNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
		*/
		
		//Find the no. of digits in number
		/*int count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.print(count);*/
		
		
		// Check the no. is Armstrong or not
		/*int sum=0;
		int originalNumber = n;
		int count =3;
		while(n>0) {
			int rem = n%10;
			sum += (int)Math.pow(rem, count);
			n=n/10;
		}
		if(originalNumber == sum) {
			System.out.println(originalNumber+" is an Armstrong number.");
		}
		else {
			System.out.println(originalNumber+" is not an Armstrong number.");
		}*/
		
		// Sum of digit until it has single digit sum
		/*int sum=0;
		int rem = 0;
		while(n>9) {
			sum =0;
			rem =0;
			while(n>0) {
				rem = n%10;
				sum = sum+rem;
				n= n/10;
				
			}
			System.out.print(sum+">>>>");
			 n=sum;
		}
		System.out.println("The sum is = "+sum);
		*/
		
		// Sum of a series 1/i
		/*double sum=0;
		for(double i=1; i<=n; i++) {
			 sum= sum+ (1/i);
		}
		System.out.print(sum);
		*/
	}
	

}
