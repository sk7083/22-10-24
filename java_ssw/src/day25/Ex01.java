package day25;

import java.util.Scanner;

public class Ex01 {
	
	/* 정수를 입력받아 입력받은 정수가 0이상이면 0부터 입력받은 수까지 합을 구하고
	 * 입력받은 정수가 0 미만이면 0부터 입력받은 수까지 차를 구하는 코드를 작성하세요.
	 * 정수 입력 : 3
	 * 0부터 3까지 합 : 6
	 * 정수 입력 : -3
	 * 0부터 -3까지 누적 차 : 6	(0 - -1 - -2 - -3) 이런식으로
	 * */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("0에서 " + num + "까지의 합은 : " + sum);
		
		} else if (num < 0) {
			for (int i = -1; i >= num; i--) {
				sum += -i;
			}
			System.out.println("0에서 " + num + "까지의 합은 : " + sum);
		}
	}
}
