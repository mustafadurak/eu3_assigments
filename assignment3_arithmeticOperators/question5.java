package assignments.assignment3_arithmeticOperators;

public class question5 {

	public static void main(String[] args) {
		
		int inputSeconds,hours,minutes,seconds;
		
		inputSeconds=3695;
		
		hours= inputSeconds/3600;
		minutes = (inputSeconds%3600)/60;
		seconds = (inputSeconds%3600)%60;
		
		System.out.println("inputSecond is "+ inputSeconds);
		System.out.println(hours + " hours "+ minutes + " minutes " + seconds + " seconds");
	
		

	}

}
