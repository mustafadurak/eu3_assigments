package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question13_bankServiceFees {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of checks for the month:");
		int checks=input.nextInt();
		double fee= 0;
		if(checks<20) {
			fee=checks*10;
		}else if(checks>=20 && checks<40) {
			fee=checks*8;
		}else if(checks>=40 && checks<60) {
			fee=checks*6;
		}else {
			fee=checks*4;
		}
		System.out.println("The bank's service fees for the month is $"+fee);
	}

}
