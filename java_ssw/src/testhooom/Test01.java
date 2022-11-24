package testhooom;

import java.util.Scanner;

public class Test01 {
	//public static void sum() {
		public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num >= 0) {
			System.out.println("작동!");
			int i = 1;
			
			while(i <= num) {
				sum += i;
				i++;
				System.out.println("작동!!");
			}
			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
		} else {
			System.out.println("숫자가 1 이상이 아닙니다.");
		}
		
		
		
//		int sum = 0;
//		if(num >= 0) {
//			int i = 1;
//			while(i <= num) {
//				sum += i;
//			}
//			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
//		} else {
//			System.out.println("숫자가 1 이상이 아닙니다.");
//		}
		
	}
}
