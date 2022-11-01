package day07;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 주어진 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, 메소드를 이용할 것
		 */
//============================================================		
		//첫번째 방법	: 소수인지 아닌지만 출력하는 메소드
		Test01();
//============================================================
		//두번째 방법	: 해당 값이 소수인지 아닌지 출력하는 메소드
		Test02(6);
//============================================================
		//세번째 방법	: 매개변수 값이 소수인지 아닌지 출력하는 메소드
		int num = 7;
		int cnt =0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;
				}	
		}
		
		if(cnt==2) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}
		System.out.println(Test03(num));
//============================================================
	System.out.println("=========교수 풀이=========");
	
		printPrimeNumber(5);	//첫번째 방법
		System.out.println(isPrimeNumber(5));	//두번째 방법
//============================================================	
	}	//main문 닫는 괄호	
//============================================================
	//첫번째 방법
		/* 기능 : 소수인지 아닌지만 출력하는 메소드
		 * 매개변수	: 없음
		 * 리턴타입	: 없음 => void
		 * 메소드명	: Test01
		 * */
	public static void Test01(/*매개변수*/){
		int num = 3;
		int cnt =0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;
				}	
		}
		
		if(cnt==2) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}			
	}
//============================================================
	//두번째 방법
	/* 기능 : 해당 값이 소수인지 아닌지만 판단하는 메소드
	 * 매개변수	: num => 정수 => int num
	 * 리턴타입	: 없음 => void
	 * 메소드명	: Test02
	 * */
	public static void Test02(int num) {
		int cnt =0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;
				}	
		}
		
		if(cnt==2) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}			
	}
//============================================================	
	//세번째 방법
	/* 기능 : 정수가 주어지면 소수인지 아닌지 출력하는 코드
	 * 매개변수	: 정수 => int num
	 * 리턴타입	: num => 정수
	 * 메소드명	: Test03
	 */
	public static int Test03(int num) {
		return num;
	}
//============================================================
	//교수 풀이
//============================================================
	/* 기능		: 정수가 주어지면 소수인지 아닌지 *출력하는* 메소드
	 * 매개변수	: 정수 => int num
	 * 리턴타입	: 출력 => 없음 (void)
	 * 메소드명	: printPrimeNumber
	 * */
	public static void printPrimeNumber(int num) {
		int cnt =0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				cnt++;
			}	
		}
		
		if(cnt==2) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아님");
		}
	}
//============================================================
	/* 기능		: 정수가 주어지면 소수인지 아닌지 *알려주는* 메소드
	 * 매개변수	: 정수 => int num
	 * 리턴타입	: 소수인지 아닌지 => boolean
	 * 메소드명	: isPrimeNumber
	 * */
	public static boolean isPrimeNumber(int num) {
		for(int i=2; i<num; i++) {
			//1과 num를 제외한 약수
			if(num % i == 0) {
				return false;
			}
		}
		return num <= 1 ? false : true;	//1 이하면 거짓 이상이면 참
	}
//============================================================
}
