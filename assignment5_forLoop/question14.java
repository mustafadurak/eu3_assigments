package assignments.assignment5_forLoop;

public class question14 {

	public static void main(String[] args) {
		
		for(int i=0; i<7;i++) {
			System.out.print("#");
			if(i!=0) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			}
			System.out.println("#");
		}

	}

}
