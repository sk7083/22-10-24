package day03;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		/*정수 num가 2의 배수이면 2의 배수라고 출력하고
		 * 3의 배수이면 3의 배수라고 출력하고
		 * 6의 배수이면 6의 배수라고 출력하고
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력하는 코드를 작성
		 * 단, 6의 배수는 6의 배수라고만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num%2==0 && num%6!=0) {
			System.out.println(num+"는 2의 배수입니다.");
		} else if(num%6==0) {
			System.out.println(num+"는 6의 배수입니다.");
		} else if (num%3==0){
			System.out.println(num+"는 3의 배수입니다.");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		sc.close();

	}

}
