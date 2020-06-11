package assignments.assigment6_nestedForLoop;

public class question2 {

	public static void main(String[] args) {
		int pick=9;
		int number = pick;
		for (int i=1; i<=pick; i++) {
			
			for(int j=1; j<=number; j++) {
				System.out.print(j+" ");
				
			}
			number--;
			System.out.println();
		}
		
		for(int i=1; i<=pick; i++) {
			
			for(int j=1; j<=i ; j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
