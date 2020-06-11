package assignments.Assignment4_ifStatementsSwitch;

public class question4_telephoneBill {

	public static void main(String[] args) {

		int calls = 250;
		double bill = 200;
		
		if (calls<=100) {
			bill = 200;
		}else if(calls>100 && calls<=150) {
			bill = 200 + (calls-100)*0.60;
		}else if(calls>150 && calls<=200) {
			bill = 200 + 50*0.60 + (calls-150)*0.50;
		}else {
			bill = 200 + 50*0.60 + 50*0.50 + (calls-200)*0.40;
		}
		System.out.println("Your Telephone Bill is $"+bill);
	}

}
