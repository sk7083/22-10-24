package day14;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		/*Calendar 클래스 : 날짜와 관련된 클래스
		 * get()을 통해서 년도, 월, 일, 시, 분, 초 등 다양한 정보를 가져옴
		 * */
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		cal.add(Calendar.YEAR, 1); //add(추가) 1년을, 그렇기에 1년 추가된 결과가 나옴
		//-1로 설정 시엔 1년 전 / MONTH, DATE외에도 가능
		
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "년 ");
		int month = cal.get(Calendar.MONTH)+1;	//month(월)은 0부터 시작이기에 +1 해야함
		System.out.print(month+"월 ");
		int date = cal.get(Calendar.DATE);
		System.out.print(date + "일 ");
		int hour = cal.get(Calendar.HOUR_OF_DAY); //HOUR로 할 시 17시가 아닌 5시로 표기
		System.out.print(hour + "시 ");
		int min = cal.get(Calendar.MINUTE);
		System.out.print(min + "분 ");
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec + "초 ");
	}

}
