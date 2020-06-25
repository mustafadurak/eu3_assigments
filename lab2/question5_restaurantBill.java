package assignments.lab2;

import java.util.Scanner;

public class question5_restaurantBill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the charge for the meal:");
		double charge=sc.nextDouble();
		
		double tax=charge*0.0675;
		double tip=(charge+tax)*0.20;
		double totalBill=charge+tax+tip;
		
		System.out.println("meal charge:"+charge+", tax amount:"+tax+", tip amount:"+tip+", total bill:"+totalBill);
		
		
	}

}
