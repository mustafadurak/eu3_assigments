package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question7_seconds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of seconds:");
		double seconds = input.nextDouble();
		double res = seconds;
		if(seconds>=60 && seconds<3600) {
			res = seconds/60;
			System.out.println("it is equal to "+res + " minutes");
		}else if(seconds>=3600 && seconds<86400) {
			res = seconds/3600;
			System.out.println("it is equal to "+res + " hours");
		}else if(seconds>=86400) {
			res = seconds/86400;
			System.out.println("it is equal to "+res + " days");
		}else {
			System.out.println("it is equal to "+res + " seconds");
		}
		
	}

}
