package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question12_internetService {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your internet package:");
		String internetPackage= input.next();
		System.out.println("Enter number of hours that were used: ");
		int hours = input.nextInt();
		double bill = 0;
		switch(internetPackage) {
		case "A":case "a":
			bill=9.95+(hours-10)*2.00;
			break;
		case "B":case "b":
			bill=13.95+(hours-20)*1.00;
			break;
		case "C":case "c":
			bill=19.95;
			break;
		}
		System.out.println("total charges : $"+bill);
	}

}
