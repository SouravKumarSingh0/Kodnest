import java.util.Scanner;
public class DemoSwitch1 {

	public static void main(String[] args) {
		System.out.println("User please enter ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		/*char ch = sc.next().charAt(0);
		System.out.println("User please enter operand 1");
		int a = sc.nextInt();
		
		System.out.println("User please enter operand 2");
		int b = sc.nextInt();*/
		
		
		switch(ch) {
		/*case '+' : System.out.println(a+b); // fall through happening for + because no break keyword is present
			
		case '-' : System.out.println(a-b);
			break;
		case '*' : System.out.println(a*b);
			break;
		case '/' :
			if(b>0) {
				System.out.println(a/b);
			}
			break;*/
		case 5 : System.out.println("five");
			break;
		
		default: System.out.println("Invalid value");
		}
		sc.close();
	}

}
