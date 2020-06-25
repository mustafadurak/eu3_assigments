package assignments.lab2;

import java.util.Scanner;

public class question3_sumTillNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a positive number:");
		int number=sc.nextInt();
		int sum=0;
		for(int i=0;i<=number;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of the number 1 up to your number is:"+sum);

	}

}
