import java.util.Scanner;

public class example0331_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		
		while(true) {
			inputDate = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� : \"" + inputDate +"\"");
			if (inputDate.equals("q")) {
				break;
			}
		}
		System.out.println("����");
	}
}
