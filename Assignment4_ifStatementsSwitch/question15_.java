package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question15_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=input.nextInt();
		
		switch(number) {
		case 0:case 1:case 2:
			System.out.println("Low number");
			break;
		case 3:case 4:case 5:
			System.out.println("Medium number");
			break;
		default:
			System.out.println("Other number");
		}
	

	}

}
