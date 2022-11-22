package day22;

import lombok.Data;

@Data


public class Student {
	private String name;
	private String birth;

	
	public Student(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}



	
}
