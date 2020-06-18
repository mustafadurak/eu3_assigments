package day14_MethodCont;

public class lab1_q1 {

	public static void main(String[] args) {
		
		String hi="Hi";
		int times=3;
		
		stringTimes(hi,times);

	}

	public static void stringTimes(String hi, int times) {
		
		for(int i=1; i<=times;i++) {
			
			System.out.print(hi);
		}
		
	}

}
