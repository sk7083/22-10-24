package day03;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		//정수 num가 3의 배수이면 3의 배수라고 출력하고, 아니면 3의 배수가 아닙니다. 코드 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		sc.close();

	}

}
