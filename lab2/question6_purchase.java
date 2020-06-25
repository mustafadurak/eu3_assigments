package assignments.lab2;

import java.util.Scanner;

public class question6_purchase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of the purchase:");
		double purchase=sc.nextDouble();
		
		double stateTax=purchase*0.04;
		double countyTax=purchase*0.02;
		double totalTax=stateTax+countyTax;
		double totalSales=purchase+totalTax;
		
		System.out.println("purchase:"+purchase+", state sale tax:"+stateTax+", county sale tax:"+countyTax+", total sale tax:"+totalTax
				+", total of the sale:"+totalSales);

	}

}
