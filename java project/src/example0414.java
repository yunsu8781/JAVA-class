
public class example0414 {

	public static void main(String[] args) {
		
		String strVar1 = "�ɹ�ö";
		String strVar2 = "�ɹ�ö";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");	
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");				
		} 
		
		String strVar3 = new String("�ɹ�ö");
		String strVar4 = new String("�ɹ�ö");

		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");			
		} else {			
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");			
		}
		
	}
}
