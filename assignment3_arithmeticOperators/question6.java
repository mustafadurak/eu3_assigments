package assignments.assignment3_arithmeticOperators;

public class question6 {

	public static void main(String[] args) {
		
		int miligram = 12;
		int overdose = 10_000;
		int drinks = overdose/miligram;
		
		System.out.println("number of miligram in drink : "+miligram);
		System.out.println("It would take about "+drinks+ " drinks for a lethal overdose");
	}

}
