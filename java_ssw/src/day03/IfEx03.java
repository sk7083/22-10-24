package day03;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		/*조건식1이 참일때 실행문 실행
		 * if(조건문) {
		 * 		실행문
		 * }
		 * 
		 * 조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행
		 * else if (조건식2) {
		 * 					실행문2;
		 * }
		 * 
		 * 조건식1과 조건식2가 거짓이면 실행문3을 실행
		 * else {
		 * 			실행문3;
		 * }
		 */

		//정수가 양수, 음수, 0인지 판별하는 코드를 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num+"은 양수다");
		} else if(num==0) {
			System.out.println(num + "은 0이다");
		} else {
			System.out.println(num + "은 음수다");
		}
		
		sc.close();
	}

}
