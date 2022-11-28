package day25;

import java.util.Scanner;

public class Ex04_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성.
		 * - 사용자가 연속 3번 이길때 까지 반복
		 * 예 :
		 * 사용자 : 가위
		 * 컴퓨터 : 보
		 * 사용자가 이겼습니다. 더 하시겠습니까?(y/n) : y
		 * 사용자 : 가위
		 * 컴퓨터 : 주먹
		 * 컴퓨터가 이겼습니다. 더 하시겠습니까?(y/n) : y
		 * */
		do {
			System.out.println("사용자 : ");
			String user = sc.next();
			
			System.out.println("더 하시겠습니까?(y/n)");
		}while(!sc.next().equals("n"));

		sc.close();
		
	}
}

