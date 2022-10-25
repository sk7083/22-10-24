package day02;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.println("실수를 입력하세요 : ");
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		System.out.println("입력하세요 : ");
		String str = sc.nextLine();
		System.out.println(str);
		*/
		System.out.println("정수A와 정수B를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("정수 A의 값은 : "+a+" 입니다.");
		System.out.println("정수 B의 값은 : "+b+" 입니다.");
		
		sc.close();
	

	}
}
