package day14_MethodCont;

public class lab1_q3 {

	public static void main(String[] args) {
		
		
		
		specialEleven(11);
		specialEleven(23);
		specialEleven(1);

	}

	public static void specialEleven(int num) {
		
		if(num%11==0 || (num-1)%11==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
