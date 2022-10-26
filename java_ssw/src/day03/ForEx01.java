package day03;

public class ForEx01 {

	public static void main(String[] args) {
		/* for(1.초기화; 2.5.조건식; 4.7.증감식) {
		 * 		3.6. 실행문;
		 * }
		 * 1. 초기화 : 조건식 또는 실행문에서 사용하는 변수를 초기화
		 * 			for문 시작 시 1번만 실행, 생략 가능
		 * 2. 조건식 : 거짓이면 반복문을 종료, 참이면 반복문을 실행, 생략 가능
		 * 			*단 생략 시 무조건 참으로 실행
		 * 4. 증감식 : 조건식에서 사용하는 변수를 증가/감소시켜서 반복문 횟수를 결정
		 * - 초기화 + 조건식 + 증감식 => 반복 횟수를 결정
		 * - 실행문 : 규칙적인 작업
		 */
	
		
		for(int i = 0; i<5; i++) {
			for(int q=1; q<5-i; q++) {
				System.out.print(" ");
			}
			
			for(int e=0; e<i*2+1; e++) {
				System.out.print("*");
			}
			System.out.println();
		}


	
		
	}
}

