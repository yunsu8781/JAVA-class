package submit;

public class Test040202 {
	
	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 1; i < 101; i++) {
			
			if (i%3 == 0) {
				num+=i;
			}
			
		}
		System.out.println(num);
		
	}

}
