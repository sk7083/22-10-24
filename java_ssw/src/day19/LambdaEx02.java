package day19;

import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		//람다식 : 인터페이스의 메소드를 오버라이딩 하는 것
		
		//람다식 기본 형태
		Sum sum = (a, b)-> a + b;
		System.out.println(sum.run(1, 2));
		
		Print<Integer> print = num -> System.out.println(num);
		print.run(10);
		
		
		Consumer<String> print2 = str -> System.out.println(str);
		//매개변수와 리턴타입이 없는 경우 사용 -> ex) 메뉴판 출력 등?
		print2.accept("10");
	}

}

interface Sum{
	double run(double a, double b);
}

interface Print<T>{	//제네릭 써도되고 안써도 가능 <> T는 그냥 이름
	void run(T num);
}