package day09;

public class ThisEx01 {

	public static void main(String[] args) {
		Test03 t1 = new Test03(); //기본 생성
		
		Test03 t2 = new Test03(10);
	}

}
/* this : 객체 본인을 나타내는 참조변수
 * - 주로 매개변수의 이름과 필드의 이름이 같으면서 메소드안에서 같이 사용될 때
 * 	=> 메소드에서 매개변수의 이름과 필드(멤버변수)의 이름이 같으면 변수를 호출했을 때 매개변수가 불려짐
 *  메소드 명이 길때 자동완성을 위해서 사용
 *  
 *  this() : 해당 클래스의 생성자를 호출, 생성자에서 첫번째 줄에 추가
 *  */

class Test03{
	private int num;		//필드(멤버 변수)
	
	public void setNum(int num) {	//잘못된 메소드
		
		//num = num;	//필드 num값을 num에 넣으려햇으나 현재는 필드 = 필드; 라고 쓴꼴
		this.num = num;	//이건 올바른 형태
	}
	
	public int getNum() {	//메소드
		return num;
	}
	
	public void print() {
		System.out.println(this.getNum());
	}
	
	public Test03() {
		this(10);	//다른 생성자를 가져올 때 this() 빈칸으로 둠
	}
	
	public Test03(int num) {
		this.num = num;
	}
}