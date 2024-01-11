import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		int col = sc.nextInt();
		
		// declaration or creation of 2D Array
		
		//int[][] a = new int[row][col];
		//System.out.println("Give the value for "+row+" rows and "+col+" columns");
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++ ) {
			//Taking the value of i and j using below statement
			a[i][j] = sc.nextInt();
			}
		}*/
		
		int[][] a = {{10, 20, 30}, {40, 50, 60}, {70,80,90}};
		System.out.println("The value of "+row+" rows and "+col+" columns are:");
		
		/*for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}*/
		
		
		//Print the elements like Matrix
		/*for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
		// Display specific elements of row and Col
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// Sum of all the elements of the matrix
		/*int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("The sum is: "+sum);*/
		
		//Sum of principal diagonal elements (upper left to lower right diagonal)
		/*int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
				sum = sum + a[i][j];
				}
			}
		}
		System.out.println("The sum of principal Diagonal is: "+sum);*/
		
		// Sum of Secondary Diagonal 
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if((i+j)==a.length-1) {
				sum = sum + a[i][j];
				}
			}
		}
		System.out.println("The sum of Secondary Diagonal is: "+sum);

	}
}
