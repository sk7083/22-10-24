package day04;

public class NestingForEx02 {

	public static void main(String[] args) {
		/* 2부터 100사이의 소수를 출력하는 코드를 작성하세요.
		 * 
		 */
		
		// $$$$$$$$$$$$$내가 푼 풀이 재 확인 필요
		int i, cnt, num =2;		//변수 초기화
		
		for(num =2; num<=100; num++) {
		// num(2)~100까지 반복하는 for문
			for(i = 1, cnt=0; i<=num; i++) {
		// i가 num보다 크거나 같을때 작동
		// cnt는 0으로 설정
				if(num % i == 0) {
		// i를 num으로 나누었을 때 나머지가 0이면 참
					cnt++;
		// 조건식이 참일 때 cnt을 증가
				}
			}
			if(cnt == 2) {
		// 카운터가 2일 때 참
				System.out.print(num + " ");
		// 조건식이 참일 때, num을 출력
			}
		}
		
		
			
		
		

	}

}
