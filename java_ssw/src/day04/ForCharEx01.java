package day04;

import java.util.Scanner;

public class ForCharEx01 {

	public static void main(String[] args) {
		//for문을 이용하여 종료문자인 q가 입력될때까지 동작하는 코드
		
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		for( ;ch !='q' ;) {
			System.out.println("문자를 입력하세요 : ");
			ch = sc.next().charAt(0);
		}
			
			
			System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}

}
