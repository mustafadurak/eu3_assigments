package day14_MethodCont;

public class lab1_q2 {

	public static void main(String[] args) {
		
		
		
		love6(6,4);
		love6(10,4);
		love6(5,4);
		love6(1,5);

	}

	public static void love6(int num1, int num2) {

		
		if(num1==6 || num2==6 || num1+num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
