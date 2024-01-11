import java.util.Scanner;

public class SearchArrayPresentinElement {

	public static void main(String[] args) {
		boolean isPresent = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array.");
		
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println(a.length+" is the size of an Array.");
		
		System.out.println("User enter an elements of an Array :");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements in an Array to check.");
		int b = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if (b==a[i]) {
				isPresent = true;
			break;
			}
		}
		if(isPresent == true) {
			System.out.println("Element is Present");
		}
		else {
			System.out.println("Not Present");
		}
	}
		
	

}
