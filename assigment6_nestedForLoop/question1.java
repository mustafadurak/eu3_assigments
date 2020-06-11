package assignments.assigment6_nestedForLoop;

public class question1 {

	public static void main(String[] args) {
		
		int pick=7;
		
		for(int i=1; i<=pick; i++) {
			
			for(int j=1; j<=i ; j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		int number = pick;
		for (int i=1; i<pick; i++) {
			
			for(int j=1; j<number; j++) {
				System.out.print(j+" ");
				
			}
			number--;
			System.out.println();
		}

	}

}
