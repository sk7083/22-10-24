package day02;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* next(); : 공백을 제외한 한 단어를 입력 받음
		 * 
		 * nextLine(); : 공백을 포함한 모든 문자열을 입력 받음
		 */
		
		System.out.println("한 문장을 입력하세요 : ");
		String str1 = sc.nextLine();
		
		System.out.println(str1);
		
		
		System.out.println("한 단어을 입력하세요 : ");
		String str2 = sc.next();
		
		System.out.println(str2);
		
		sc.close();
		
		
	}

}
