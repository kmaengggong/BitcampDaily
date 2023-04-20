package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		StringBuilder sb = new StringBuilder();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		sb.append(year).append("년 ").append(month).append("월 ").append(day).append("일 ");
	
		String strWeek = null;
		switch(week) {
			case Calendar.SUNDAY:		strWeek = "일"; break;
			case Calendar.MONDAY:		strWeek = "월"; break;
			case Calendar.TUESDAY:		strWeek = "화"; break;
			case Calendar.WEDNESDAY:	strWeek = "수"; break;
			case Calendar.THURSDAY:	strWeek = "목"; break;
			case Calendar.FRIDAY:		strWeek = "금"; break;
			case Calendar.SATURDAY:	strWeek = "토"; break;
		}
		
		sb.append(strWeek).append("요일 ");
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		sb.append(hour).append("시 ").append(minute).append("분 ").append(second).append("초 입니다.");
		
		System.out.println(sb.toString());
	}
}
