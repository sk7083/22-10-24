package day07;

public class MethodEx05 {

	public static void main(String[] args) {
		//1부터 10까지 합을 구하는 코드를 작성하세요. 단, 메소드를 이용할 것
//============================================================		
		//첫번째 풀이 (출력)
		System.out.println(printSum01());
//============================================================
		//두번째 풀이 (출력)
		printSum02(1,5);
//============================================================
		//교수 풀이 (출력)
		int start = 1; int end = 10;
		System.out.println(start + "부터"+end+"까지의 합 : "+sum02(end, start));
//============================================================
	}
//============================================================
		//첫번째 풀이 (메소드)
	
	/* 기능		: 1 ~ 10까지의 합을 구하는 코드 출력
	 * 매개변수	: 없음
	 * 리턴타입	: sum값
	 * 메소드명	: printSum01
	 * */
	public static int printSum01() {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
//============================================================
		//두번째 풀이 (메소드)
	
	/* 기능		: min과 max값을 지정하여 mi ~ max 합을 구하는 코드 출력
	 * 매개변수	: 정수 => int sum
	 * 리턴타입	: min, max 값
	 * 메소드명	: printSum02
	 * */
	public static int printSum02(int min, int max) {		
		int sum = 0;
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;

	}
	
//============================================================
		//교수 풀이
//============================================================
	/* 기능		: 시작숫자부터 끝숫자 사이의 모든 정수를 더하고, 더한 결과를 알려주는 메소드
	 * 매개변수	: 시작 숫자, 끝 숫자 => int start, int end
	 * 리턴타입	: 더한 결과 => 정수 => int
	 * 메소드명	: sum
	 * */
	public static int sum02(int start, int end) {
		if(start > end) {
			int tmp = start;	//출력창에 start 와 end 위치가 변경되어도 제대로 출력이 됨
			start = end;
			end = tmp;
		}
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		return sum;
	}
//============================================================
}
