package assignments.lab2;

import java.util.Scanner;

public class question1_largestAndSmallest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enteryour first number:");
		int num1=input.nextInt();
		System.out.print("Enter your next number:");
		int num2=input.nextInt();
		int numLargest;
		int numSmallest;
		
		if (num1>num2) {
			numLargest=num1;
			numSmallest=num2;
		}else if(num1<num2) {
			numLargest=num2;
			numSmallest=num1;
		while(true) {
		
			System.out.println("Do you want to enter ther number: 0-No, 1-Yes");
			int yesNo=input.nextInt();
			
			if(yesNo==0) {
				break;
			}else {
				System.out.println("Enter your next number:");
				int num3=input.nextInt();
				if(num3>=numLargest) {
					numLargest=num3;
				}else if(num3<=numSmallest) {
					numSmallest=num3;
				}
			}
		
			
		}	
		
		System.out.println("Smallest number is:"+numSmallest);
		System.out.println("Largest number is:"+numLargest);
	}

	}
}