package assignments.assignment5_forLoop;

public class question11_reverseTriangle {

	public static void main(String[] args) {

		int rows=10;
		int number=rows;
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				
			}
			for(int p=number; p>=1; p--) {
				System.out.print(p+" ");
				
			}
			System.out.println();
			number--;
		}
	
		
		

	}
}
