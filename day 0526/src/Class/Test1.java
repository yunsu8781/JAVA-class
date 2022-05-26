package Class;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int todayWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		week weekend = null;

		switch (todayWeek) {
		case 1: 
			weekend = week.SUNDAY;	
		break;
		case 2: 
			weekend = week.MONDAY;	
		break;
		case 3: 
			weekend = week.TUESDAY;	
		break;
		case 4: 
			weekend = week.WEDNESDAY;	
		break;
		case 5: 
			weekend = week.THURSDAY;	
		break;
		case 6: 
			weekend = week.FRIDAY;	
		break;
		case 7: 
			weekend = week.SATURDAY;	
		break;
	
		}
	}
}
