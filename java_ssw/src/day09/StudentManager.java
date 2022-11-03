package day09;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		/* 메뉴
		 * 1. 학생 추가
		 * 2. 학생 성적 추가
		 * 3. 학생 정보 출력
		 * 4. 프로그램 종료
		 * */
		//반복문을 통해 메뉴를 출력 (종료를 선택할 때 까지)
		
		int menu;
		

		HighStudent [] list = new HighStudent [30];
		int cnt = 0;
		
		do {
			//메뉴를 출력
			printMenu();
			//메뉴 선택 (입력)
			menu = selectMenu();
			
			//선택한 메뉴에 맞는 기능 실행
			cnt = runMenu(menu, list,cnt);
			
		} while (menu != 4);
		
	}
	/* 메뉴를 출력하는 메소드
	 */
	public static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

	/* 콘솔에서 입력받은 정수(메뉴)를 알려주는 메소드
	 * @return 입력받은 정수(메뉴)
	 */
	public static int selectMenu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/* 메뉴에 맞는 기능을 실행하는 메소드
	 * @param menu 선택한 메뉴
	 * @param list 학생들 정보가 들어있는 리스트
	 * @return 현재 저장된 학생 수
	 */
	public static int runMenu(int menu, HighStudent [] list, int cnt) {
		int grade, classNum, num;
		String name;
		Scanner sc = new Scanner(System.in);
		switch(menu) {
		case 1 :
			//학생 추가
			//학생 정보를 입력
			System.out.print("학생 정보 입력(학년, 반, 번호, 이름순) : ");
			grade = sc.nextInt();
			classNum = sc.nextInt();
			num = sc.nextInt();
			name = sc.next();
			
			//리스트에 학생 정보를 추가
			list[cnt] = new HighStudent(grade, classNum, num, name);
			
			//리스트에 들어가있는 학생 수 1증가
			cnt++;
			
			break;
		case 2 :
			//학생 성적 추가
			//학생을 선택 => 학생 정보를 출력 후, 학생을 선택
			for(int i =0; i<cnt; i++) {
				System.out.println("===========================");
				System.out.println(i+1+"번 학생");
				System.out.println("===========================");	
				list[i].print();
				System.out.println("===========================");
			}
			System.out.println("학생 선택 : ");
			int index = sc.nextInt() - 1; //0번째 학생이 생기기 때문에 -1		
			//성적을 입력
			System.out.println("성적 입력(국어, 영어, 수학) : ");
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			//해당 학생의 성적을 입력받은 성적으로 변경
			list[index].updateScore(kor, eng, math);
			//index번지에 있는걸 받아옴
			break;
		case 3 :
			//학생 정보 추가
			for(int i =0; i<cnt; i++) {
				list[i].print();
			}
			break;
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		return cnt;
	}
	
}



