package submit;

import java.util.Random;

public class Test040203 {
	public static void main(String[] args) {
		
		while (true) {
			int num1 = (int) (Math.random()*6)+1;
			int num2 = (int) (Math.random()*6)+1;
			
			System.out.print(num1+":");
			System.out.println(num2);
			if (num1 + num2 ==5) {
				System.out.println( "(" + num1 + "," + num2 + ")");
				break;
			}
		}
		
		
	}
}
