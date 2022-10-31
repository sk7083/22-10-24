package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {
	public static void main(String[] args) {
		/* 5명 학생의 국어, 영어, 수학 성적을 저장하기 위한 배열을 만들고,
		 * Scanner를 이용하여 입력받아, 국어 평균, 영어 평균, 수학 평균을 구하는
		 * 코드를 작성하세요.
		 * 힌트 : 학생과 성적 어느걸 기준으로 잡고 배열을 만드나
		 */
		
		
		/*	오답
		int score[] = new int[5];
		String num[] = new String[] {"국어", "영어", "수학"} ; 
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<score.length; i++) {
			System.out.println(i+1 +"번째 학생 성적 : ");
			for(int q=0; q<num.length; q++) {
			System.out.println(num+"의 점수를 입력하세요 : ");	
			score[i] = scan.nextInt();
			}
			System.out.println(i+1 +"번째 학생 성적 : "+ score[i]);
			
		}
		*/
		
		 //오답
		/*
		int grade[] = new int[5];
		int std[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<grade.length; i++) {
			System.out.println((i+1)+"번째 학생의 영어 성적을 입력해주세요 : ");
			grade[i] = sc.nextInt();
		}
		*/
		
		
		//강사 풀이 (과목 기준)
		int stdCnt = 5;					//학생 수
		int kor[] = new int[stdCnt];	//국어 성적
		int eng[] = new int[stdCnt];	//영어 성적
		int math[] = new int[stdCnt];	//수학 성적

		
		//학생별 국어, 영어, 수학 성적을 입력 (동시 입력)
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<stdCnt; i++) {	//학생 수 만큼 반복
			System.out.print("학생"+(i+1)+"의 국어, 영어, 수학 성적을 입력 : ");
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
		}
		
		//과목별 총점
		double korSum = 0;
		double engSum = 0;
		double mathSum = 0;
		for(int i=0; i<stdCnt; i++) {
			korSum += kor[i];
			engSum += kor[i];
			mathSum += kor[i];
		}
		//과목별 평균
		System.out.println("국어 성적의 평균 : " + korSum / stdCnt);
		System.out.println("영어 성적의 평균 : " + engSum / stdCnt);
		System.out.println("수학 성적의 평균 : " + mathSum / stdCnt);

		//학생별 평균 (추가 문제)
		for(int i=0; i<stdCnt; i++) {
			//i번지(1번째~ 학생들의 국어, 영어, 수학 총점의 값을 sum값에 대입)
			double sum = kor[i] + eng[i] + math[i];
			//그대로 평균값 계산
			System.out.println("학생"+(i+1)+"의 평균 : "+sum / 3);
		}
		sc.close();
	}
}
