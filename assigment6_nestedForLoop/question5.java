package assignments.assigment6_nestedForLoop;

public class question5 {

	public static void main(String[] args) {

		int rows=7;
		int colomns=7;
	
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=colomns; j++) {
				if(i==rows) {
					for(int p=1; p<=i;p++) {
						System.out.print(i);
						}
						break;
					
				}
				System.out.print("1");
				
				if(j== colomns-i) {
					for(int p=1; p<=i;p++) {
					System.out.print(i);
					}
					break;
				}
			}
			System.out.println();
		}
		

	}

}
