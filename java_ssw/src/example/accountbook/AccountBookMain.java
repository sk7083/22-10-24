package example.accountbook;

import java.util.Scanner;

public class AccountBookMain {

	public static void main(String[] args) {
		AccountBook ab = new AccountBook(new Scanner(System.in));
		//객체를 생성 후(new)  생성자 AccountBook를 호출. 하지만 괄호 안에 (new Scanner)를 호출
		//main -> AccountBook -> Scanner	// 메소드 스택
		
		ab.run();

	}

}

/* 가계부 프로그램을 작성하세요.
 * 메뉴
 * 1. 내역 추가
 * 2. 내역 확인
 * 3. 내역 수정
 * 4. 내역 삭제
 * 5. 종료
 * 
 * 1. 내역 추가
 * 구분 : 수입/지출
 * 분류 : 식비/통신비/교통비/생활비/용돈
 * 내용 : 홈플러스/x약국/x식당
 * 금액 : 5000
 * 일시 : 년, 월, 일
 * 
 * 2. 내역 확인
 * 2-1. 전체 내역 확인
 * 2-2. 년 내역 확인
 * 2-3. 월 내역 확인
 * 2-4. 일 내역 확인
 * 
 * 구분 | 일시 | 분류 | 내용 | 금액 순으로
 * 
 * 3. 내역 수정
 * 년, 월, 일로 검색 후 내역 출력
 * 번호를 입력
 * 입력 받은 번호에 맞는 내역을 수정 - 구분 | 일시 | 분류 | 내용 | 금액순으로 입력받아 수정
 * 
 * 4. 내역 삭제
 * 년, 월, 일로 검색 후 내역 출력
 * 번호를 입력
 * 입력 받은 번호에 맞는 내역을 삭제
 * 
 * 추가 - 가계부를 년, 월, 일로 정렬
 */

/* 가계부가 필요
 * 가계부는 내역들로 구성
 * 가계부 클래스
 * 내역(항목) 클래스
 * 가계부는 내역들을 가지고 있다(포함 관계) => 가계부 클래스에 내역 객체가 필드
 * 내역 추가, 확인, 수정, 삭제 기능을 인터페이스로 묶을 수 있다.
 */