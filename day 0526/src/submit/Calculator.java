package submit;

public class Calculator {
	
	public Calculator(){
		System.out.println("on");
	}
	//더하기
	public int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	public double plus(double a, double b) {
		double result = a+b;
		return result;
	}
	
	//빼기
	public int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	public double minus(double a, double b) {
		double result = a-b;
		return result;
	}
	
	//곱하기
	public int multiply(int a, int b) {
		int result = a*b;
		return result;
	}
	public double multiply(double a, double b) {
		double result = a*b;
		return result;
	}
	
	//나누기
	public int divide(int a, int b) {
		int result = a/b;
		return result;
	}
	public double divide(double a, double b) {
		double result = a/b;
		return result;
	}

	
	
	
}
