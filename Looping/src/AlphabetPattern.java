
public class AlphabetPattern {

	public static void main(String[] args) {
		// A
		for(int i=1; i<=8;i++) {
			for(int j =1; j<=8; j++) {
				if(i==1 || i ==4 || j==1|| j==8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// B
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==4 || i==8|| j==1||j==8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//C
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==8|| j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//D
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==8|| j==1||j==8) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//E
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==4 || i==8|| j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//F
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==4 || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		//G
		for(int i=1; i<=8; i++) {
			for(int j =1; j<=8;j++) {
				if(i==1 || i==8|| j==1||j==8 || (j==4 && i>=4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
