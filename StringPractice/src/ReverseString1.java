import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your string");
    	String s = sc.nextLine();
    	
    	char a[] = s.toCharArray();
    	int left = 0;
    	int right = a.length-1;
    	while(left<right) {
    	
    	if(a[left] != 32 && a[right]!= 32) {
    		char temp = a[left];
    		a[left] = a[right];
    		a[right] = temp;
    		left++;
    		right--;
    	}
    	else if(a[left] ==32){
    		left++;
    	}
    	
    	else if(a[right]==32) {
    		right--;
    	}
    	}
    	
    	String swappedString = new String(a);
        System.out.println("Swapped string: " + swappedString);

	}

}
