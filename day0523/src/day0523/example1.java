package day0523;

import java.util.Calendar;

public class example1 {
	public static void main(String[] args) {

		int month = Calendar.getInstance().get(Calendar.MONTH);
		String season = " ";
		 month = month +1;
		
		switch (month) {
		case 12,1,2:
			season = "겨울";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		case 9,10,11:
			season = "가을";
			break;

		default:
			break;
		}
		System.out.println(month + "월");
	}
}
