package day05;

import java.util.Scanner;

import day04.ContinueEx01;

public class ForUpDownEx02 {

	public static void main(String[] args) {

		
		/* 랜덤한 정수를 맞추는 up down 게임
		 * 예시 : (생성한 랜덤한 수 50)
		 * 1 ~ 100 사이의 랜덤한 수를 맞추세요.
		 * 숫자를 입력하세요 : 40
		 * UP
		 * 숫자를 입력하세요 : 60
		 * DOWN
		 * 숫자를 입력하세요 : 50
		 * 정답입니다.
		 * 더하시겠습니까? (Y/N) : N
		 * 프로그램을 종료합니다
		 */
		
		int max=100;
		int min=1;
		int a;
		int r;
		
		Scanner sc = new Scanner(System.in);
		
		for( ; ;) {		//전체를 무한 반복
//===============================================게임 한판		
		for(a=0; a>=0; a++) {	//무한 반복시키는 for문 생성
								//스캐너를 무한으로 반복시키기 위함
			r = (int)(Math.random()*(max - min + 1)+min);
		System.out.println("숫자를 입력하세요 : ");
		System.out.println("랜덤한 수 : " + r);
		System.out.println(r);
		int b = sc.nextInt();	//사용자가 숫자 입력

//=========================================================			
		if(b==r) {
			System.out.println("정답입니다.");
		} else if(b<r) {
			System.out.println("UP");
		} else if(b>r) {
			System.out.println("DOWN");
		}
	}
		System.out.println("더하시겠습니까? (y/n) : ");
		if(sc.next().charAt(0) == 'n') {
			break;
		}
}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	
}
}
