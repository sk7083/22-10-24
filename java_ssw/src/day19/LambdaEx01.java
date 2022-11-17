package day19;

import java.util.ArrayList;

import java.util.Collections;

public class LambdaEx01 {
	//람다식 예제
	/* 람다식을 쓰는 이유?
	 * - 코드가 간결해짐 (아래 예제 참고)
	 * - 콜렉션에서 필터링이 쉬워짐
	 * 
	 * 람다식은 언제 사용?
	 * - 함수적 인터페이스의 객체가 필요한 경우
	 * 
	 * 함수적 인터페이스란?
	 * - 인터페이스의 추상메소드가 1개인 인터페이스
	 * */

	public static <T> void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(-1);
		list.add(100);
		list.add(22);

		System.out.println(list);
		Collections.sort(list, (a,b)-> a-b);	//람다식 사용
		System.out.println(list);

	}

}
