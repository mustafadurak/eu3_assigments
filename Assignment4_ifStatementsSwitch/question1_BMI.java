package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question1_BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Weight in Pounds:");
		int weightInPounds= input.nextInt();
		System.out.println("Enter Your Height in feet followed by space then additional inches:");
		int heightInFeet  = input.nextInt();
		int heightInInchesAdditional = input.nextInt();
		
		double massInKg = weightInPounds/2.2;
		double heightInmeters = (heightInFeet*12+heightInInchesAdditional)* 0.0254;
		
		double BMI = massInKg/(heightInmeters*heightInmeters);
		String risk = "Obese";
		
		if(BMI<18.5) {
			risk = "Underweight";
		}else if(BMI>=18.5 && BMI<25) {
			risk = "Normal Weight";
		}else if(BMI>=25 && BMI<30) {
			risk = "Overweight";
		}
		System.out.println("Your weight in pounds: "+ weightInPounds);
		System.out.println("Your height in feet followed by a space then additional inches: "+heightInFeet+" "+heightInInchesAdditional);
		System.out.println("Your BMI is "+ BMI);
		System.out.println("Your risk factory is "+risk);
		
		
	}

}
