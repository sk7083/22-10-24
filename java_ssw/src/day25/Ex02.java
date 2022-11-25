package day25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	
	/* 정수를 5번 입력하여 배열/리스트에 저장하는 코드를 작성하세요
	 * 정수가 홀수이면 그대로 저장, 정수가 짝수이면 -를 붙여서 저장
	 * */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//1. 배열을 사용한 방법
//		int[] arr = new int[5];
//
//		System.out.println("정수를 5번 입력 : ");
//		for (int i = 0; i < 5; i++) {
//			int num = sc.nextInt();
//			if (num % 2 == 0) {
//				arr[i] = -num;
//			} else{
//				arr[i] = num;
//			}
//		}
//		for(int tmp : arr) {
//			System.out.println("배열 값 : " + tmp);
//		}
		
		//2. 리스트를 사용한 방법 
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("정수를 5번 입력 : ");
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				list.add(-num);
			} else{
				list.add(num);
			}
		}
		for(int tmp : list) {
			System.out.println("배열 값 : " + tmp);
		}
	}
}
