import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
            System.out.println("Enter the size of an Array.");
            int size = sc.nextInt();
            int a[] = new int[size];
            

            System.out.println("User enter elements of the Array:");

            for (int i = 0; i < a.length; i++) {
                try {
                    a[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer.");
                    sc.next();
                
                }
            }
            System.out.println("Enter the index to know the element");

            try {
                int idx = sc.nextInt();
                
                System.out.print("Element = " + a[idx]);
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid integer for index.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter the index value in the range of 0 to size - 1");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Input is Wrong.");
        }
		
		catch(NegativeArraySizeException e) {
			System.out.println("Enter a positive number for Array size.");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
