package day27;

public class Member {
	private String name, phone, pw, id;
	private int birth, grade;
	
	public Member() {
		
	}

	public Member(String name, String phone, String pw, String id, int birth, int grade) {
		this.name = name;
		this.phone = phone;
		this.pw = pw;
		this.id = id;
		this.birth = birth;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\n"+"이름 : " + name +"\n"+ "ID : " +id+"\n" + "PW : " + pw+"\n"+"전화번호 :" + phone+"\n" + "생년월일 : " + birth+"\n"+"등급 : "+grade+"\n"+"===================================="+"\n";
	}
	
	
	
}
