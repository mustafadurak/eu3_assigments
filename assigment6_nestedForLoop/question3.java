package assignments.assigment6_nestedForLoop;

public class question3 {

	public static void main(String[] args) {
		
		int rows=7;

		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				
			}
			for(int p=i; p<=rows; p++) {
				System.out.print(p+" ");
				
			}
			System.out.println();
			
		}
		int space=rows;
		for(int i=1; i<rows; i++) {
			for(int j=1; j<space; j++) {
				System.out.print(" ");
				
			}
			space--;
			for(int p=space; p<=rows; p++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		

	}

}
