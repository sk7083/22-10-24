package day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.
		 * 예시 : (생성한 랜덤한 수 50)
		 * 1 ~ 100 사이의 랜덤한 수를 맞추세요.
		 * 숫자를 입력하세요 :
		 */
		int max=100;
		int min=1;
		int a;
		
		int r = (int)(Math.random()*(max - min + 1)+min);
		System.out.println("랜덤한 수 : " + r);
		
		Scanner sc = new Scanner(System.in);
//=========================================================		
		for(a=0; a>=0; a++) {	//무한 반복시키는 for문 생성
								//스캐너를 무한으로 반복시키기 위함
		System.out.println("숫자를 입력하세요 : ");
		int b = sc.nextInt();	//사용자가 숫자 입력
//=========================================================			
		if(b==r) {
			System.out.println("정답입니다.");
			break;
		} else if(b<r) {
			System.out.println("UP");
		} else if(b>r) {
			System.out.println("DOWN");
		}
	}
		sc.close();		//스캐너를 무한 반복하되 close는 반복문 밖에 선언
		
		
		
		
		
	}

}
