package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question6_objectsWeightsInNewton {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the object mass in kg:");
		double mass = input.nextDouble();
	
		double weightInNewton= mass*9.8;
	
		if(weightInNewton>1000) {
			System.out.println("It is too heavy");
		}else if(weightInNewton<10) {
			System.out.println("It is too light");
		}else {
			System.out.println("It is normal");
		}

	
	}
}
