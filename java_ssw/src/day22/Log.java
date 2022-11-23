package day22;

import lombok.Data;

@Data
public class Log {

	private String date,name, birth, attendance;

	public Log(String date, String name, String birth, String attendance) {
		this.date = date;
		this.name = name;
		this.birth = birth;
		this.attendance = attendance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "날짜 : "+date+"\n"+"이름 : "+name+"\n"+"생년월일 : "+birth+"\n"+"출석 : "+attendance;
	}
}
