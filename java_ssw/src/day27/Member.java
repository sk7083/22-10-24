package day27;

public class Member {
	private String name, phone, pw, id;
	private int birth;
	
	public Member() {
		
	}

	public Member(String name, String phone, String pw, String id, int birth) {
		this.name = name;
		this.phone = phone;
		this.pw = pw;
		this.id = id;
		this.birth = birth;
	}

	public Member(String pw, String id) {
		this.pw = pw;
		this.id = id;
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
		return "name : " + name +"\n"+"phone :" + phone+"\n" + "pw : " + pw+"\n" + "id : " + id +"\n"+ "birth : " + birth+"\n";
	}
	
	
	
}
