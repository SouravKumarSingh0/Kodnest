import java.util.Scanner;

public class SwapWithTemp {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        sc.close();

	}

}
