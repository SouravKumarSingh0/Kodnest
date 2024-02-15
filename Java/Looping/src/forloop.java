import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 1 ; i<=3;i++) {
			for (int j = 1; j <5; j++) {
				System.out.print("*");
			}
				System.out.println("*");
		}
		
		for(int k = 1; k<=5;k++) {
			for (int l = 1; l<2; l ++) {
				System.out.print("*");
			}
			System.out.println("*");
		}*/
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String a = sc.nextLine();
		
		
		if(s.equals("web") && a.equals("[2,1,6]")) {
			System.out.println("flh");
		}
		else if(s.equals("web") && a.equals("[2,1,5]")) {
			System.out.println("wlc5");
		}
		else {
			System.out.println("wlcg");
		}
	}

}


