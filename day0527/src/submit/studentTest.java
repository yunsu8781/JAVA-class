package submit;

public class studentTest {
	public static void main(String[] args) {
		Student[] st = new Student[4];
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student("Student" + (i+1), 17 +i);
		}
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student("Student" + (i+1), 17 +i);
			System.out.println(st[i].toString());
		}
		System.out.println("--------------------------------");
		for(int j = 0; j < st.length; j++) {
			st[j].age = st[j].age+1;
			System.out.println(st[j].toString());
		}
	
			
	}
}
