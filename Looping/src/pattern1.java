
public class pattern1 {

	public static void main(String[] args) {
		// printing rectangle
		/*for(int i=1; i<5; i++) {       //*****
			for(int j=1; j<=5; j++) {    //*****
				System.out.print("*");   //*****
			}                            //*****
			System.out.println("");
		}*/
		
		// printing right angle triangle
		/*for(int i=1;i<=4;i++) {         // *
			for(int j=1;j<=i;j++) {       // **
				System.out.print("*");    // ***
			}                             // ****
			System.out.println("");
		}
		
		for(int i=1; i<=4;i++) {         // ****
			for(int j=4;j>=i;j--) {      // ***
				System.out.print("*");   // **
			}                            // *
			System.out.println("");
		}*/
		
		/*for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {         //       *
				System.out.print(" ");		//		**
			}								//	   ***
			for(int k=1;k<=i;k++) {			//    ****
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		//outer loop
		/*for(int i=1;i<=4; i++) {
			//inner loop
			for(int j=1;j<=5; j++) {                    // *****
				if(i==1 || j==1 || i==4 || j==5) {      // *   *
					System.out.print("*");              // *   *
				}                                       // *****
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");		}*/
		
		/*for(int row=1; row<=4;row++) {              
			for(int col =1; col<=4;col++) {				//****?
				System.out.print("*");					//****??
			}											//****???
			for(int col=1; col<=row;col++) {			//****????
				System.out.print("?");
			}
			System.out.println("");
		}*/
		
	/*	for(int i=1;i<=4; i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+i-1);
			}
			System.out.println("");				//1234													
		}										//2345		
		int n=0;								//3456
		for(int i = 1;i<=4;i++) {				//4567
			n=i;
			for(int j=1;j<=4;j++) {
				System.out.print(n++);
			}
			System.out.println("");
		}*/
		
		/*for(int i=10;i<=40;i=i+10) {
			for(int j=10;j<=i;j=j+10) {
				if(i==j) {							//10
					System.out.print(j);			//10*20
				}									//10*20*30
				else {								//10*20*30*40
					System.out.print(j+"*");
				}
			}
			System.out.println("");
		}*/
	}

}
