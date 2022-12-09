package test12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String str = simpleDate.format(date);
		System.out.println(str);
	}
}
