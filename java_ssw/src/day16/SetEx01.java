package day16;

import java.util.HashSet;

public class SetEx01 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(10);
		set.add(1);
		set.add(100);
		set.add(22);
		System.out.println(set);
		//set에 경우 순서가 고정이 되지않음 (추가할 때마다 위치가 변함)
		//1 ~ 10 사이에 경우엔 순서대로 정렬
	}

}
