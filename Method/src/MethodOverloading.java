
public class MethodOverloading {

	public static int add(int a, int b) {
        return a + b;
    }

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    
    public static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

   
    public static String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(5, 10));
        System.out.println("Sum (double): " + add(2.5, 3.5));
        System.out.println("Sum (int, int, int): " + add(2, 3, 5));
        System.out.println("Sum (double, double, double): " + add(1.1, 2.2, 3.3));
        System.out.println("Sum (int, int, int, int): " + add(1, 2, 3, 4));
        System.out.println("Sum (double, double, double, double): " + add(1.1, 2.2, 3.3, 4.4));
        System.out.println("Concatenated Strings: " + concatenate("Hello, ", "World!"));
        System.out.println("Concatenated Strings: " + concatenate("Java", " is ", "awesome!"));
}
}
