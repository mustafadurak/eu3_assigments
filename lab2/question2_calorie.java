package assignments.lab2;

import java.util.Scanner;

public class question2_calorie {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of the purchase:");
		double numberOfCookies=sc.nextDouble();
		
		double calories= (numberOfCookies/10)*300;
		
		System.out.println("Your total calories consumed is: "+calories);
		
		

	}

}
