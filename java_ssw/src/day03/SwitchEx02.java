package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력 받아 산술 연산 결과를 하는 코드를 스위치문으로 작성하세요.
		 * break가 없을 경우 다음 case의 실행문으로 이동 (다음 case 값과 다르더라도 진행됨)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("산술연산자를 선택해주세요 (+, -, *, /, %)");
		char e = sc.next().charAt(0);
		
		switch(e) {
		 case '+' :
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-' :
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*' :
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/' :
			System.out.println(num1+" / "+num2+" = "+(double)(num1/num2));
			break;
		case '%' :
			System.out.println(num1+" % "+num2+" = "+(num1%num2));
			break;
		default :
			System.out.println("산술연산자가 아닙니다.");
		}
		
		
		sc.close();

	}

}
