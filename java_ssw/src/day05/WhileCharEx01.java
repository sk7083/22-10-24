package day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		//문자를 입력받아 q이면 종료하고, 아니면 반복하는 코드를 작성하세요.
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		char ch = sc.next().charAt(0);
		
		while(ch !='q') {
			System.out.println("다시 입력해주세요");
		} 
			System.out.println("종료되었습니다.");
		
		sc.close();
		*/
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력하세요.");
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				break;
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
