package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question8_discount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of packages purchased:");
		int quantityPackages = input.nextInt();
		
		final int retailsPackagePrice = 99;
		double discount = 0;
		double totalPrice = quantityPackages*retailsPackagePrice;
		
		if(quantityPackages>=10 && quantityPackages<=19) {
			discount = totalPrice*0.20;
			
		}else if(quantityPackages>=20 && quantityPackages<=49) {
			discount = totalPrice*0.30;
		}else if(quantityPackages>=50 && quantityPackages<=99) {
			discount = totalPrice*0.40;
		}else if(quantityPackages>=100) {
			discount = totalPrice*0.50;
		}
		
		totalPrice = totalPrice+discount;
		System.out.println("The amount of discount : $"+discount);
		System.out.println("Total amount of purchase after discount : $"+totalPrice);
	}
	

}
