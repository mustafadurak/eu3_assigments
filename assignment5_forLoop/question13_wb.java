package assignments.assignment5_forLoop;

public class question13_wb {

	public static void main(String[] args) {
		
		int rows=8;
		int colomns=8;
		
		for(int i=1; i<=rows; i++) {
			
			if(i%2!=0) {
			
				for(int j=1; j<=colomns; j++) {
				
					if(j%2!=0) {
					System.out.print("W ");	
					}else {
					System.out.print("B ");
					}
				
				}
			}else {
				for(int j=1; j<=colomns; j++) {
					
					if(j%2!=0) {
					System.out.print("B ");	
					}else {
					System.out.print("W ");
					}
				
				}
				
			}
			System.out.println();
		}
			

	}

}
