package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question9_shippingCompany {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of package in pounds :");
		double weight= input.nextDouble();
		System.out.println("Enter miles :");
		int distance = input.nextInt();
		
		double shippingCharge=0;
		if(distance%500==0) {
			if(weight<=2) {
				shippingCharge=1.10*(distance/500);
			}else if(weight>2 && weight<=6){
				shippingCharge=2.20*(distance/500);
			}else if(weight>6 && weight<10) {
				shippingCharge=3.70*(distance/500);
			}else {
				shippingCharge=3.80*(distance/500);
			}
		}else if(weight<=2) {
			shippingCharge=1.10*(distance/500+1);
		}else if(weight>2 && weight<=6){
			shippingCharge=2.20*(distance/500+1);
		}else if(weight>6 && weight<=10) {
			shippingCharge=3.70*(distance/500+1);
		}else {
			shippingCharge=3.80*(distance/500+1);
		}
		System.out.println("The shipping charge is : $" + shippingCharge);
		
	}
			
		
}
		
	
	



