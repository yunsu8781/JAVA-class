package submit;

public class calTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int value1 = cal.plus(1, 2);
		System.out.println(value1);
		
		double value2 = cal.plus(1, 2);
		System.out.println(value2);
		
		int value3 = cal.minus(1, 2);
		System.out.println(value3);
		
		double value4 = cal.minus(1, 2);
		System.out.println(value4
				);
		
	}
}
