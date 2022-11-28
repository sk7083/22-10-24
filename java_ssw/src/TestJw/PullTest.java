package TestJw;

import java.util.Scanner;

public class PullTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "확인";
//		do {
//			System.out.println("입력 : ");
//			str =sc.nextLine();
//		} while(str.equals("ㅎ"));
		
		while(str.equals(str)) {
			System.out.println("입력 : ");
			str =sc.nextLine();
		}
		System.out.println("끝");
	}
	public PullTest() {
		System.out.println("Update Test");

	}
}
