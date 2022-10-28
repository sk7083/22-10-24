package day05;

public class WhileEx01 {

	public static void main(String[] args) {
		/* while문 문법
		 * 
		 * while(조건식) {
		 * 		실행문;
		 * }
		 * ========================
		 * 초기화;
		 * while(조건식) {
		 * 		실행문;
		 * 		증감식;	//기본 형태엔 없음. 그래서 컨티뉴해도 이쪽으로 오지않음
		 * }
		 * =========================
		 * continue는 while문에서 조건식으로 이동 (본래는 증감식으로 이동)
		 */
		int i=1;
		
		while(i<=5) {	//1번 코드
			System.out.println("Hello World!");
			i++;
		}
		
		while(i++ <=5) {//2번 코드
			System.out.println("Hello World!");
			
		}//서로 결과는 같음 후위 연산자를 통해 2번 코드에서 ()조건식에서 비교를 한 다음에 i값을 더하기 때문
		//while문에서는 조건식을 생략할 수 없다.
		//while문에서 무한루프를 만들려면 조건식에 true를 넣어주면 된다.
	}

}
