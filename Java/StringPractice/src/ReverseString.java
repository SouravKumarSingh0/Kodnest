import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your string");
    	String s = sc.nextLine();
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
    
     static String reverseWords(String s) {
        String[] words = s.split("//+s");
        
        
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse(); 
            reversed.append(reversedWord).append(" ");
        }
        
        return reversed.toString().trim();
    }
}
