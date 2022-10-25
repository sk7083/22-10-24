package day02;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//콘솔에서 한 단어이상을 입력하고, next(), nextLine() 순으로 동작을 하면
		//nextLine()에는 콘솔에서 따로 입력하지 않아도 앞에서 입력한 값이 들어간다.
		
		/*
		System.out.println("한 단어를 입력하세요 : ");
		String str2 = sc.next();
		
		System.out.println(str2); //입력 버퍼에 남아 있는 문자열과 공백을 제거
		
		System.out.println("한 문장을 입력하세요 : ");
		String str1 = sc.nextLine();
		
		System.out.println(str1);
		
		String name = "홍길동";
		int age = 20;
		System.out.println(name+"의 나이는 : "+age+"살 입니다.");
		
		
		int num1 = 10;
		int num2 = 20;
		char operator = '+';
		System.out.println(num1+operator+num2+"="+(num1+num2)+"입니다.");
		
		*/
		
		
		
		
		sc.close();

	}

}
