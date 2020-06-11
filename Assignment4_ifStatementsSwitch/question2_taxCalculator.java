package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question2_taxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your income:");
		long income = input.nextLong();
		double tax = income*0.25;
		if(income>150_000_000 && income<=300_000_000) {
			 tax = (150_000_000*0.25) + (income-150_000_000)*0.3;
		}else if(income>300_000_000 && income<=600_000_000){
			tax =  (150_000_000*0.25) + (150_000_000*0.3)+ (income-300_000_000)*0.35;
		}else if(income>600_000_000 && income<=1200_000_000){
			tax =  (150_000_000*0.25) + (150_000_000*0.3)+ (300_000_000*0.35)+(income-600_000_000)*0.40;
		}else if(income>1200_000_000){
			tax =  (150_000_000*0.25) + (150_000_000*0.3)+ (300_000_000*0.35)+ (600_000_000*0.40)+(income-1200_000_000)*0.50;
		}
		System.out.println("Your Income: "+ income);
		System.out.println("The task amount you have to pay: "+tax);

	}

}
