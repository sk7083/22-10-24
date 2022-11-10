package day14;

import lombok.Data;

public class RuntimeExceptionEx01 {

	public static void main(String[] args) {
		
		//RuntimeExeption은 코드 상 에러 표시가 안나고, 실행 시 예외가 발생할 수 있음
		//예외처리가 필수가 아님
		
		//1. 에러 예제
		//(에러)ArithmeticException 발생. 0으로 나누면 안됨
	//	int num1 = 1, num2 = 0;
	//	System.out.println(num1/num2);	(에러 발생)
	//	System.out.println(num1%num2);	(에러 발생)
		
		//2. 에러 예제
		//Parent p = null;
		//p.print(); 
		//exceptionTest(p);
		
		//3. 에러 예제
		//int [] arr = new int [-1];
		//배열의 크기가 음수라서 (에러) java.lang.NegativeArraySizeException이 발생
		
		//4. 에러 예제
		//int [] arr2 = new int[5];
		//arr2[5] = 5;
		//접근할 수 없는 번지에 접근 시도 (에러) java.lang.ArrayIndexOutOfBoundsException이 발생
	
		//5. 에러 예제
		//Parent p1 = new Parent();
		//Child c = (Child)p1;
		//강제 클래스 변환이 불가능하기에 (에러)java.lang.ClassCastException이 발생
		
	}
	public static void exceptionTest(Parent a) {
		//a가 null인 경우 (에러)java.lang.NullPointerException이 발생
		a.print();
	}
}
@Data
class Parent {
	private int num;
	public void print() {
		System.out.println(num);
	}

}

class Child extends Parent{}