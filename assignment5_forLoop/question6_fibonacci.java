package assignments.assignment5_forLoop;

public class question6_fibonacci {

	public static void main(String[] args) {

		int n = 10;
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0 ; i<=n;i++) {
			System.out.print(n1 + ",");
			int sum = n1+n2;
			n1 = n2;
			n2 = sum;
		}
        



	}

}
