package day20;

import lombok.Data;

@Data
public class PhoneList {
	private String lastName, name, job;
	private int phone;
	
	
	public PhoneList(String lastName, String name, String job, int phone) {
		this.lastName = lastName;
		this.name = name;
		this.job = job;
		this.phone = phone;
	}



}
