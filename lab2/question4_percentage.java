package assignments.lab2;

import java.util.Scanner;

public class question4_percentage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of males:");
		int males=sc.nextInt();
		System.out.print("Enter number of females:");
		int females=sc.nextInt();
		
		double percMalesInClass= males*100/(males+females);
		double perFemalesInClass=females*100/(males+females);
		
		System.out.println("Percentage of males in class:"+percMalesInClass);
		System.out.println("Percentage of females in class:"+perFemalesInClass);

	}

}
