package day20;

import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

import lombok.Data;

@Data
public class PhoneNumber {
	private String pName, number;
	
	//@Data 때문에 이미 생성되잇으나 정규식 표현을 위해 setNumber 생성
	public void setNumber(String number) {	
		String regex = "\\d{2,3}-\\d{3,4}-\\d{4}";
		if(Pattern.matches(regex, number)) {
			this.number = number;
		} else {
			throw new RuntimeException("예외 발생 : 번호를 잘못입력했습니다.");
		}
	}

	public PhoneNumber(String pName, String number) {
		this.pName = pName;
		setNumber(number);
	}
	
	@Override
	public String toString() {
		return "[" + pName + " : " + number + "]";
	}
	
	public void update(String pName, String number) {
		this.pName = pName;
		this.number =number;
	}
	
}
