import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		/*int row = sc.nextInt();
		
		int col = sc.nextInt();
		
		int z = sc.nextInt();		
		
		int[][][] a = new int[row][col][z];*/
		
		int[][][] a = {{{10, 20, 30}, {40, 50, 60}} ,{{70,80,90},{110,120,130}}};
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++ ) {
				for(int k=0;k<a[i][j].length;k++) {
					//Taking the value of i, j and k using below statement
					a[i][j][k] = sc.nextInt();
					}
				}
			}*/
		// Display specific elements of row and Col and z
		for(int i=0; i<a.length;i++) {
			System.out.println("{");
			for(int j=0;j<a[i].length;j++) {
				System.out.print("[");
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+ ",");
				}
				System.out.println("]");
			}
			System.out.println("}");
		}

	}

}
