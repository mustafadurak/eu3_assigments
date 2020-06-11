package assignments.assignment5_forLoop;

public class question12 {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			switch(i) {
			case 1:
				for(int j=1;j<=10;j++) {
					System.out.print(j+" ");
				}
			break;
			case 2:
				System.out.println();
				for(int j=2;j<=20;j+=2) {
					System.out.print(j+" ");
				}
			break;
			case 3:
				System.out.println();
				for(int j=3;j<=30;j+=3) {
					System.out.print(j+" ");
				}
			break;
			}
		}

	}

}
