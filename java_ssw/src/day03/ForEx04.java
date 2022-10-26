package day03;

public class ForEx04 {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수를 출력하는 코드를 작성하세요.
		 * 
		 * 
		 */
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int q=1; q<=5; q++) {
			System.out.println(q*2);
		}
		
	}

}
