package day04;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		/*
		 * 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요. 
		 * 소수는 약수가 1과 자기 자신뿐인 수
		 * 1은 소수가 아님
		 */

		int num = 11;
		int cnt = 0;	
		
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;	//0으로 나뉘었을 때 0인값을 cnt(카운터)를 1씩 증가시킴
			}	
		}
		
		if(cnt==2) {	//증가된 카운터로 소수인지 아닌지 판별
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}			
	}
}
