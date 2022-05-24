package submit;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[][] score = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				score[i][j-1]=(3*i)+j;
			}	
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]);
			}
			System.out.println();
		}
		
	}
}
