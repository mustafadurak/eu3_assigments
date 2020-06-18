package day14_MethodCont;

public class lab1_q4 {

	public static void main(String[] args) {

		
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);

	}

	public static void deerPlay(int num, boolean summer) {
		
		if(summer) {
			if(num>=60 && num<=100) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}else {
			if(num>=60 && num<=90) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
		
	}

}
