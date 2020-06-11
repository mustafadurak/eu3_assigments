package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question3_leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year= input.nextInt();
		
		if(year%100==0) {
			if(year%400==0) {
				System.out.println(year+"  Leap Year");
			}else {
				System.out.println(year+"  Not a Leap Year");
			}
		}else if(year%4==0) {
			System.out.println(year+"  Leap Year");
		}else {
			System.out.println(year+"  Not a Leap Year");
		}

	}

}
