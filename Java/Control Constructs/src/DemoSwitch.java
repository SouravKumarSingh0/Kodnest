import java.util.Scanner;
public class DemoSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Please enter Number 1");
		int a = sc.nextInt();
		
		System.out.println("User Please enter Number 2");
		int b = sc.nextInt();
		
		System.out.println("User please enter operator");
		//char ch= sc.next().charAt(0);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case '4': System.out.println(a+b);
		break;
		case 3: System.out.println(a-b);
		break;
		case '2': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		case '%': System.out.println(a%b);
		break;
		default: System.out.println("Invalid operator");
		}
		
		
		
		sc.close();

	}

}
