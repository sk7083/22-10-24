package studyTest;

import java.util.ArrayList;

public class Member {
	//회원정보는 이름, 나이, 주소, 핸드폰 번호, 포인트
	private String name, address, tel;
	private int age, point;
	
	private ArrayList<Bill> bill = new ArrayList<Bill>();
	
	public ArrayList<Bill> getBill() {
		return bill;
	}

	public void setBill(ArrayList<Bill> bill) {
		this.bill = bill;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {

		return " 이름 : " + this.name + "\n 나이 : " + this.age + "\n 주소 : "  + this.address + "\n 핸드폰 번호 : " + this.tel + "\n 포인트 : " + this.point + "점";
	}
	//회원정보는 이름, 나이, 주소, 핸드폰 번호, 포인트
}
