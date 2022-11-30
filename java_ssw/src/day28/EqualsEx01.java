package day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

public class EqualsEx01 {
	public static void main(String[] args) {
		/* List에서 제공하는 indexOf와 contains
		 * */
		List<Test> list = new ArrayList<Test>();
		list.add(new Test(1,1));
		list.add(new Test(1,2));
		list.add(new Test(1,3));
		list.add(new Test(2,1));
		list.add(new Test(3,1));
		list.add(new Test(4,1));
		System.out.println(list);
		int index = list.indexOf(new Test(1,3));
		System.out.println(index);
		Test t = new Test(2,1);
		System.out.println("equals : " + t.equals(new Test(2,2)));
		//2라는 Integer가 잇는지 확인
		/* 리스트.indexOf(비교객체)에서 Object.equalse를 호출하는데,
		 * Object.equals(비교객체, 리스트에서 꺼낸 객체)를 호출하기 때문에
		 * 비교 객체.equals(리스트에서 꺼낸 객체)로 비교
		 * 아래 indexOf는 Integer.equals(Test 객체)를 하기 때문에 -1이 나옴*/
		index = list.indexOf((Integer)2);
		System.out.println("indexOf : "+index);
		System.out.println("equals : "+t.equals((Integer)2));
		
		System.out.println(Objects.equals(new Test(2,1), (Integer)2));
		System.out.println(Objects.equals((Integer)2, new Test(2,1)));
		
		List<Test> list2 = new ArrayList<Test>();
		list2.add(new Test(1,1));
		list2.add(new Test(1,2));
		System.out.println("두 리스트 비교 : " + list.containsAll(list2));
		list.add(new Test(10,1));
		System.out.println("두 리스트 비교 : " + list.containsAll(list2));

	}
}

@Data
class Test {
	public Test() {
		// TODO Auto-generated constructor stub
	}

	int num1;
	int num2;

	public Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			if(obj instanceof Integer) {
				if(num1 == (Integer)obj) {
					return true;
				}
			}
			return false;
		}
			
		
		Test other = (Test) obj;
		if (num1 != other.num1)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		return result;
	}
	
}