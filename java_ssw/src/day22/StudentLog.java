package day22;

import lombok.Data;

@Data
public class StudentLog {

	private String name, birth;

	
	public StudentLog(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
}
