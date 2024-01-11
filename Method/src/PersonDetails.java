import java.util.Scanner;
public class PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Person person1 = new Person();
        System.out.println("Enter details for person 1:");

        System.out.print("Enter name: ");
        person1.name = sc.nextLine();

        System.out.print("Enter age: ");
        person1.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter address: ");
        person1.address = sc.nextLine();
        
        System.out.println("\nDetails for person 1:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Address: " + person1.address);

        Person person2 = new Person();
        System.out.println("Enter details for person 2:");

        System.out.print("Enter name: ");
        person2.name = sc.nextLine();

        System.out.print("Enter age: ");
        person2.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter address: ");
        person2.address = sc.nextLine();

        System.out.println("\nDetails for person 2:");
        System.out.println("Name: " + person2.name);
        System.out.println("Age: " + person2.age);
        System.out.println("Address: " + person2.address);
        sc.close();


	}

}
