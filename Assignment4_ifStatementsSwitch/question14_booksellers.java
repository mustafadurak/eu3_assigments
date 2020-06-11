package assignments.Assignment4_ifStatementsSwitch;

import java.util.Scanner;

public class question14_booksellers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of books that you have purchased:");
		int book=input.nextInt();
		
		int award=0;
		
		switch(book) {
		case 0:
			award=0;
			break;
		case 1:
			award=5;
			break;
		case 2:
			award=15;
			break;
		case 3:
			award=30;
			break;
		default:
			award=60;
			
		}
		System.out.println("Your number of points awarded : "+award);
	}

}
