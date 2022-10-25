package day02;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		/* 홍길동 학생의 국어, 영어, 수학 점수를 콘솔에 입력받고(Scanner),
		 * 홍길동 학생 평균 성적을 콘솔에 출력하는 코드를 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 기입해주세요.");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		
		System.out.println("홍길동 학생의 점수는");
		System.out.println("국어 : "+A);
		System.out.println("영어 : "+B);
		System.out.println("수학 : "+C);
		
		double avg = (A+B+C)/3;
		
		System.out.println("평균 값은 "+ avg+"입니다.");
		
		//평균이 90점 이상이면 통과입니까? 결과값이 참 거짓으로.
		// 평균이 60점 이상이면 true / false
		boolean isPass = avg >= 60;
		boolean isFail = avg < 60;
		System.out.println("통과입니까?" + isPass);
		
		sc.close();
	}

}
