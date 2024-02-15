import java.util.Scanner;
public class Copy2Delement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		int col = sc.nextInt();
		
		int[][] a = new int[row][col];
		
		System.out.println("Write the element in 1st Array");
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++ ) {
				//Taking the value of i and j using below statement
				a[i][j] = sc.nextInt();
				}
		}
		
		int[][] b = new int[row][col];
		// Copy elements from a to b
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }
		
		System.out.println("The copy elements of an Array are:");
		for(int i=0; i<b.length; i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
