package day03;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		/*
		 * 점수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요. 
		 * A : 90 ~ 100  B : 80 ~ 89 
		 * C : 70 ~ 79   D : 60 ~ 69
		 * F : 0 ~ 59 잘못된 성적 : 그 외
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력해주세요.");
		int grade = sc.nextInt();
		
/*		첫번째 문제 풀이
 * 
		if (grade >= 90 && grade < 100) {
			System.out.println("학생의 성적은 A 입니다.");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("학생의 성적은 B 입니다.");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("학생의 성적은 C 입니다.");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("학생의 성적은 D 입니다.");
		} else if (grade >= 0 && grade < 60) {
			System.out.println("학생의 성적은 F 입니다.");
		} else {
			System.out.println("잘못된 성적입니다.");
		}
*/
//=======================================================

/*		두번째 문제 풀이
 * 		
		if (grade>100) {
			System.out.println("잘못된 성적입니다.");
		} else if (grade>=90) {
			System.out.println("학생의 성적은 A 입니다.");
		} else if (grade>=80) {
			System.out.println("학생의 성적은 B 입니다.");
		} else if (grade>=70) {
			System.out.println("학생의 성적은 C 입니다.");
		} else if (grade>=60) {
			System.out.println("학생의 성적은 D 입니다.");
		} else {
			System.out.println("학생의 성적은 F 입니다.");
		}
		
		*/	
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
