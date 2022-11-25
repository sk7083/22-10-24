package day25;

public class RecursionFunctionEx01 {

	public static void main(String[] args) {
		/* 재귀함수 : 함수의 실행문으로 자신을 다시 호출하는 함수
		 * - 잘못 작성하면 스택 오버 플로우(무한 루프)가 발생할 수 있음
		 * */
		
		//print(10);	출력 시 무한 루프
		//에러 발생 (RecursionFunctionEx01) 스택 오버 플로우 발생
	
	
	/* (문제) 양수 정수 n!을 구하는 코드를 작성하세요.
	 * n! = 1*2*3*4*5 ... * n
	 * 재귀함수로 변환 시 => n*(n-1)! => n*(n-1)*(n-2)!
	 * */
		
		System.out.println(factorial(5));
	}
	public static long factorial (int num) {
		if(num < 0)
			throw new RuntimeException("음수는 팩토리얼을 구할 수 없습니다.");
		if(num == 1 || num == 0) 
			return 1;
		
		return num*factorial(num-1);
	}
	
	public static void print(int num) {
		System.out.println(num);
		print(num);
	}
}
