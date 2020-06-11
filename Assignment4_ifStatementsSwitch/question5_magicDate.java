package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question5_magicDate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date a month(in numeric form), a day, a two-digit-year with space between eachother:");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		
		if(month*day==year) {
			System.out.println("Date is magic");
		}else {
			System.out.println("Date is not magic");
		}
	}

}
