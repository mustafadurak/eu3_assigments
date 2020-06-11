package assignments.assigment6_nestedForLoop;

public class question6 {

	public static void main(String[] args) {

		int rows=5;
		
		for(int i=1; i<=rows; i++) {
			int number=i;
			for(int j=1; j<=i; j++) {
				
				System.out.print(number+" ");
				number=number+(rows-j);
			}
			System.out.println();
		}
		

	}

}
