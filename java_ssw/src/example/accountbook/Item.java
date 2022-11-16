package example.accountbook;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;
@Data
public class Item {
	private String type, purpose, content;
	private int money;
	private Date date;	//날짜 자료형 Date사용
	
	
	public Item(String type, String purpose, String content, int money, String date) throws ParseException {
		//생성자 생성 (우클릭 -> Source -> Generate Constructor using Fields)
		super();
		this.type = type;
		this.purpose = purpose;
		this.content = content;
		this.money = money;
		setDate(date);	//예외 처리 필요함
	}
	
	public void setDate(String date) throws ParseException {	//예외 처리 필요함
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.date = format.parse(date);
	}
	
	public String getDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(date);
	}
	
	public String getMoneyStr() {	//돈 표현 1,000,000원 이런 형태
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(money);
	}
	
	public void print() {
		System.out.println("=================================================================");
		System.out.println("구분 : " + type);
		System.out.println("분류 : " + purpose);
		System.out.println("내용 : " + content);
		System.out.println("금액 : " + getMoneyStr() + "원");
		System.out.println("일시 : " + getDateStr());
		System.out.println("=================================================================");
	}
	
	@Override
	public String toString() {
		System.out.println("=================================================================");
		return type + " | " + getDateStr() + " | " + purpose + " | " + getMoneyStr()+  "원 | " + content;
	}
}
