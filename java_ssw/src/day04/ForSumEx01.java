package day04;

public class ForSumEx01 {

	public static void main(String[] args) {
		/* 1부터 10 사이의 짝수의 합을 구하는 코드를 작성하세요
		 * 
		 */
		int cnt= 0;					//총 합을 나타낼 변수 선언
		for(int i =1; i<=10; i++) {	//1~10까지 반복 for문
			if(i%2==0) {			//그 중에서 짝수만 출력
				cnt += i;			//반복문을 통해 i의 값이 cnt의 더해짐
			}
		}
		System.out.println(cnt);	//결과 출력
		
	}

}
