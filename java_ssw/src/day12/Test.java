package day12;

public class Test {
	public static void main(String[] args) {
		
	}
	//접근제한자 예약어 리턴타입 메소드명(매개변수); -> 추상 메소드
	//추상 클래스를 상속 받은 일반 클래스는 부모의 추상 메소드를 반드시 오버라이딩해야 함
	//추상 클래스를 상속 받은 추상 클래스는 부모의 추상 메소드를 반드시 오버라이딩해야 하는건 아님
	
}
/*
abstract class TestA{	//추상클래스 (추상메소드가 존재해야함)
	public abstract void test();//추상메소드
}

// class TestB extends TestA{	(에러발생!) //TestB가 일반 클래스이기에 상속이 불가능
	
// }

abstract class TestC extends TestA{//TestC가 추상 클래스이기에 상속이 가능
	
}
*/

interface Calculator{
	int sum(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	double div(int num1, int num2);
	int mod(int num1, int num2);
	void run();
}



