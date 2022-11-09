package day13;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		/* 학생 성적 관리 프로그램을 작성하세요.
		 * - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * */
		/* TvRemoteController remocon1 = new TvremoconA();*/

		Scanner sc = new Scanner(System.in);
		Student [] stds = new Student[30];
		int count = 0;
		while (true) {
			System.out.println("=============================메뉴=============================");
			System.out.print("1. 학생 정보 추가 | ");
			System.out.print("2. 학생 성적 추가 | ");
			System.out.print("3. 학생 정보 출력 | ");
			System.out.println("4. 프로그램 종료");
			System.out.println("=============================================================");
			System.out.println();
			System.out.println("메뉴를 선택해주세요 : ");		
		
			int number = sc.nextInt();

			if (number == 1) {
				//학생 정보를 입력(학년, 반, 번호, 이름)
				System.out.println("학생 정보를 추가합니다.");
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				System.out.print("반 : ");
				int classNum = sc.nextInt();
				System.out.print("번호 : ");
				int num = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				
				//입력한 학생 정보 없으면 추가
				//학생 정보들 중에서 하나씩 비교하여 학년, 반, 번호가 같은 학생이 있는지 확인해서
				//없으면 마지막 학생 뒤에 추가
				
				int index = -1;	//학생이 몇 번지에 있는지 알려주는 변수
				Student tmp = new Student(grade, classNum, num, name);
				for(int i =0; i<count; i++) {
					if(stds[i].equals(tmp)) {
						index = i;	//일치하는 학생의 위치(번지)
					}
				}
				if(index == -1 && count < stds.length) {
					stds[count] = tmp;
					count++;
				}
				
			} else if (number == 2) {
				System.out.println("학생 성적을 추가합니다.");
				//2. 학생 성적 추가
				//학생 정보를 입력(학년, 반, 번호)
				System.out.println("성적을 추가할 학생 정보를 입력합니다.");
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				System.out.print("반 : ");
				int classNum = sc.nextInt();
				System.out.print("번호 : ");
				int num = sc.nextInt();
				System.out.println(grade + "학년 " + classNum + "반 " + num + "번 ");
				//입력한 학생 정보가 없으면 끝
				//학생 정보들 중에서 하나씩 비교하여 학년, 반, 번호가 같은 학생이 있는지 확인해서
				//없으면 조건문 종료 (contienu)
				int index = -1;	//학생이 몇 번지에 있는지 알려주는 변수
				Student tmp = new Student(grade, classNum, num);
				//@@@@@@@@@@@@@@@@@@@@@위 name 빼면 에러
				for(int i =0; i<count; i++) {
					if(stds[i].equals(tmp)) {
						index = i;	//일치하는 학생의 위치(번지)
					}
				}
				if(index == -1) {
					continue;
				}

				//성적 정보를 입력(과목, 학기, 중간, 기말, 수행평가)
				System.out.println("성적 정보를 입력하세요.");
				System.out.println("과목 : ");
				String title = sc.next();
				System.out.println("학기 : ");
				int term = sc.nextInt();
				System.out.println("중간 : ");
				int midScore = sc.nextInt();
				System.out.println("기말 : ");
				int finalScore = sc.nextInt();
				System.out.println("수행평가 : ");
				int performace = sc.nextInt();
				//입력한 성적 정보가 없으면 추가
				//선택한 학생의 성적 정보들 중에서 과목, 학기가 같은 성적 정보가 없으면 추가
				boolean res = stds[index].addScore(new Score(title, term, midScore, finalScore, performace));
				if(res) {
					System.out.println("성적을 등록했습니다.");
				} else {
					System.out.println("성적 등록에 실패했습니다.");
				}
				stds[index].printScore();
			} else if (number == 3) {
				System.out.println("학생 정보를 출력합니다.");
				for(int i =0; i<count; i++) {
					System.out.println(stds[i]);
				}
			} else if (number == 4) {
				System.out.println("프로그램을 종료합니다.");
				
				break;
			} else {
				System.out.println("잘못된 입력입니다!!");
				System.out.println("다시 입력하세요.");
			}
			
		
		}
		

	}
}

//================================================================



