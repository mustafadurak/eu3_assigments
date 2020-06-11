package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question11_soundOfSpeed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an environment air, water or steel:");
		String environment = input.next();
		System.out.println("Enter the distance in feet");
		double distance = input.nextDouble();
		double time=0;
		switch(environment) {
		case "Air": case "AIR": case "air":
			time=distance/1100;
			break;
		case "Water": case "WATER": case "water":
			time=distance/4900;
			break;
		case "Steel": case "STEEL": case "steel":
			time=distance/16400;
			break;
		
		}
		System.out.println("It will take "+ time + " seconds");

	}

}
