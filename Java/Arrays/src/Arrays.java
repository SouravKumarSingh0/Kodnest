import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		/*//create an integer array of size 4
		int a[] = new int[4];
		
		//read elements into the array
		Scanner sc = new Scanner(System.in);
		System.out.println("User enter 4 integer elements of an Array");
		for(int i=0;i<=3;i++) {
			a[i] = sc.nextInt();
		}
		
		//write elements from the array
		System.out.println("The 4 integer elements of an Array are:");
		for(int i=0; i<=3; i++) {
			System.out.print(a[i]+",");
		}*/
		
		
		//create an integer array of size 4
		//a.length == size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array.");
		int size = sc.nextInt();
		int a[] = new int[size];
		//int b[] = new int[a.length];
		System.out.println(a.length+" is the size of an Array.");
				
		//read elements into the array
		//i == index
		// a[i] == elements of i
		System.out.println("User enter an elements of an Array :");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = sc.nextInt();
		}
				
		//write all the elements from an array
		/*System.out.println("The  elements of an Array are:");
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+",");
		}*/
		
		// to display all the even elements of an Array
		/*System.out.println("The  even elements of an Array are:");
		for(int i=0; i<=a.length-1; i++) {
			if (a[i]%2==0) {
			System.out.print(a[i]+",");
			}
		}*/
		
		// to display all the odd elements of an Array
		/*System.out.println("The odd elements of an Array are:");
		for(int i=0; i<=a.length-1; i++) {
			if (a[i]%2==1) {
			System.out.print(a[i]+",");
			}
		}*/	
		
		// Display odd index elements of an array
		/*System.out.println("The odd index elements of an Array are:");
		for(int i=0; i<=a.length-1; i++) {
			if (i%2==1) {
			System.out.print(a[i]+",");
			}
		}*/
		
		// Display odd index elements of an array
		/*System.out.println("The even index elements of an Array are:");
		for(int i=0; i<=a.length-1; i++) {
			if (i%2==0) {
			System.out.print(a[i]+",");
			}
		}*/
		
		/*System.out.println("The elements divisible by 2 & 3 of an Array are:");
		for(int i=0; i<a.length; i++) {
			if (a[i]%2==0 && a[i]%3==0) {
			System.out.print(a[i]+",");
			}
		}*/
		
		
		// Display the elements in reverse order
		/*System.out.println("The elements in reverse order of an Array are:");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+",");
		}*/
		
		// Display copy elements of an array
		/*int b[] = new int[a.length];
		b = a;
		System.out.println("The copy elements of an Array are:");
		for(int i=0; i<=b.length-1; i++) {
			System.out.print(b[i]+",");
		}*/
		
		// Find the maximum element of an Array
		
		// assuming first element of an Array as max value
		/*int max = a[0];
		
		for(int i=0; i< a.length; i++) {
			if(max < a[i]) {
				// reassumption of max value
				max = a[i];
			}
		}
		
		System.out.print("The maximum element is ="+max);*/
		
		// Find the minimum element of an Array
		
		// assuming first element of an array as min value
		/*int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(min> a[i]) {
				min = a[i];
			}
		}
		
		System.out.print("The min element is="+min);*/
		
		// find the 2nd largest element of an Array
		
		
		
		
		
		
		// sum of all the numbers of an Array
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum is: "+sum);
		
		
		
	}

}
