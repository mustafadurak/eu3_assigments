package assignments.assignment5_forLoop;

public class question9_oddNumbers {

	public static void main(String[] args) {

		int end = 11;
		int i=0;
		if(end%2==0) {
		
			while(i<=end) {
				if(i%2!=0) {
					System.out.print(i);
					if(i==end-1) {
						break;
					}else {
						System.out.print(",");
					}
				}
				i++;
			}
		}else {
			while(i<=end) {
				if(i%2!=0) {
					System.out.print(i);
					if(i==end) {
						break;
					}else {
						System.out.print(",");
					}
				}
				i++;
			}
			
		}
		
			
		
	}

}
