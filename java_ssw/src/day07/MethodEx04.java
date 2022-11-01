package day07;

public class MethodEx04 {

	public static void main(String[] args) {
		int num = 10;	//main문에 있는 int num과 메소드에 있는 int num은 다른 변수임
		printNum(num);
		
		Test t = new Test();
		printTest(t);
		printNum(num);
		printTest(t);
	}
	//main에 있는 num와 printNum에 있는 num은 이름만 같을뿐, 서로 다른 변수
	//값을 복사해서 가져옴
	//매개변수가 기본 자료형인 경우, printNum에서 숫자를 바꿔도 main에서 num는 안바뀜
	
	public static void printNum(int num) {
		System.out.println(num);
		num = 20;
	}
	//매개변수가 참조변수인 경우, 
	//printTest에서 숫자를 바꾸면 main에 있는 값도 바뀔 수 있다.
	public static void printTest(Test t) {
		System.out.println(t.a);
		t.a = 20;
	}
}
class Test{
	int a;
}