package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question10_Calories {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of calories followed by a space then fat grams in the food:");
	double calory=input.nextDouble();
	double fat = input.nextDouble();
	
	double caloriesFromFat = fat*9;
	double perCalories = caloriesFromFat/calory;
	if(perCalories <0.3) {
		System.out.println("The food is low in fat");
	}else if(perCalories>=0.3 && perCalories<=1) {
		System.out.println("The food is not low in fat");
	}else {
		System.out.println("Input is not valid");
	}
	
	

	}

}
