package assignments.assignment5_forLoop;

public class question12_v2 {

	public static void main(String[] args) {
		
		
		for(int number=1;number<=10;number++) {
			for(int i=1; i<=(number*10);i++) {
				if(i%number==0) {
					System.out.print(i+" ");
				}			
			}
			System.out.println();
		}	
	}

}
