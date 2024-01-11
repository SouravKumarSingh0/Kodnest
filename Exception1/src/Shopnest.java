import java.util.*;
public class Shopnest {

	public static void main(String[] args) {
		try {
            shop();
        } catch (Exception ex) {
            System.out.println("Shopping process failed.");
        }
	}
	public static void shop() {
		try {
			pay();
			System.out.println("Thank you for Shopping");
			}
		catch(Exception ex) {
			System.out.println("Shopping not completed , try again");
			throw ex;
		}
	}
	
	public static void pay() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("PLease enter amount: ");
			int amt = sc.nextInt();
			System.out.println("Payment successful - INR "+amt);
		}
		catch(Exception ex) {
			System.out.println("Payment not completed!");
			throw ex;
		}

	}

}
