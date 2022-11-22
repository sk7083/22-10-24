package day22;

import lombok.Data;

@Data
public class StudentLog {

	private String name, information;

	
	public StudentLog(String name, String information) {
		this.name = name;
		this.information = information;
	}
}
