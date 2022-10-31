package day06;

import java.util.Arrays;

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		int arr1[] = new int[] {1,2,3};	//3의 크기를 지닌 arr1
		int arr2[];
		
		arr2 = arr1;	//arr1을 얕은 복사해서 arr2를 만듬
		
		//깊은 복사 예제1
		//새로운 배열 객체를 생성하여 기존 배열의 데이터를 복사하는 것(값만을 복사해옴)

		
		int tmpArr[] = new int [arr1.length];
		for(int i = 0; i<arr1.length; i++) {
			tmpArr[i] = arr1[i];
		}	//17 ~ 20줄까지 깊은 복사 예제 3을 풀어 쓴 것.
		arr2 = tmpArr;
		
		//깊은 복사 예제2
		/*
		arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		*/
		
		//깊은 복사 예제3
		/*
		arr2 = Arrays.copyOf(arr1, arr1.length);
		*/
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"] = " + arr1[i] + ", arr2[" + i+ "] = "+ arr2[i]);
		}
		arr1[0] = 10;//arr1의 값만 10으로 변경
		System.out.println("====바뀐 뒤=========");
		//arr1과 arr2 값 확인, arr1, arr2모두 10 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"] = " + arr1[i] + ", arr2[" + i+ "] = "+ arr2[i]);
		}
		// System.out.println("arr1{"++i+"] = " + arr1[i] + ", arr2[" + i+ "] = "+ arr2[i]);
	}


	}


