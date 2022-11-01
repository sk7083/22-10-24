package day07;

public class ClassTestEx01 {

	public static void main(String[] args) {
		/* 인스턴스화 방법(객체를 만드는 방법)
		 * 클래스명 객체명 = new 클래스명();
		 * */
		String str = new String("abc");
		Person person1 = new Person();
		//pNo에 private을 추가하기 전에는 외부에서 접근이 가능했지만
		//캡슐화를 통해 pNo의 접근제한자 private로 설정하면 직접 접근이 불가능하여 에러 발생.
		//person1.pNo = "000101-2123456";
		//캡슐화된 pNo에 접근하려면 getter와 setter를 통해 접근해야 한다.
		person1.setpNo("000101-3123456");
		//System.out.println("주민번호 : "+person1.pNo);	//맴버 변수
		System.out.println("주민번호 : "+person1.getpNo());
		System.out.println(str.charAt(0));	//메소드
		
	}
}

/*
class 클래스명{
	접근제한자 자료형 변수명;	//맴버 변수
	
	
}
*/

/*★★★★★★★★★★ 접근제한자 종류 ★★★★★★★★★★
 * - private	: 본인 클래스만 사용가능. (내부에선 사용가능 / 외부에선 사용불가)
 * - (default)	: 본인 클래스 + 같은 패키지 (접근제한자를 쓰지 않은 경우 자동 default로 인식)
 * - protectde	: 본인 클래스 + 같은 패키지 + 자식 클래스
 * - pubilc		: 본인 클래스 + 같은 패키지 + 자식 클래스 + 외부 클래스 => 전부 (공동으로 사용가능)
 * - 범위			: private < (default) < protectde < pubilc
 */

class Person {
	private String pNo;			//맴버 변수들
	private String name;
	private char gender;
	private String adress;
	private String phone;
	private int age;
	
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//setter 형태
	public void setPno(String personNumber) {
		pNo = personNumber;
	}
	//getter 형태
	public String getPno() {
		return pNo;
	}
	
}