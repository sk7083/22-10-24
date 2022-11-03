package day09;

public class ConstructorEx01 {

	public static void main(String[] args) {
		
			
		Test01 t1 = new Test01();	// ()안에 아무것도 안쓸 경우 기본 생성자를 사용한다는 뜻
									// 기본 생성자를 구현하지 않았을 경우 (Test01 경우) 기본적으로 기본 생성자가 초기화 되있음
		//Test02클래스는 기본 생성자가 없기 때문에 기본 생성자로 초기화 할 수 없다.
		//Test02 t2 = new Test02();	//에러 발생
		Test02 t2 = new Test02(10);
		
		//Scanner 클래스는 기본 생성자를 구현하지 않았기 때문에 기본 생성자를 이용하여
		//초기화 할 수 없다.
		//Scanner sc = new Scanner();
		
	}

}
/* 클래스에 생성자를 하나도 구현하지 않으면 기본 생성자가 자동으로 추가 됨
 * 클래스에 생성자가 하나라도 있으면 기본 생성자가 자동으로 추가되지 않음
 */
class Test01{
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}


class Test02{
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public Test02(int num1) {
		num = num1;
	}

}



