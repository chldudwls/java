package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2024/07/16
 * 이름 : 최영진
 * 내용 : 자바 Date 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		
		
		//Date 클래스
		Date date = new Date();
			System.out.println("date: " + date);
		SimpleDateFormat saf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String result = saf.format(date);
			System.out.println(result);
			
		//
		Calendar ca1 = Calendar.getInstance();
		
		int yy = ca1.get(Calendar.YEAR);
		int mm = ca1.get(Calendar.MONTH)+1;
		int dd = ca1.get(Calendar.DATE);
		int hour = ca1.get(Calendar.HOUR);
		int min = ca1.get(Calendar.MINUTE);
		int sec = ca1.get(Calendar.SECOND);
		
		
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d", yy, mm, dd, hour, min, sec);
	}
}
