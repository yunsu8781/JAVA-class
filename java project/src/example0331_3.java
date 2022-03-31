import java.util.Scanner;

public class example0331_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		
		while(true) {
			inputDate = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputDate +"\"");
			if (inputDate.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}
}
