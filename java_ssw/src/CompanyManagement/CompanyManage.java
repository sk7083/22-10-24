package CompanyManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyManage {
	static Scanner sc = new Scanner(System.in);
	EmployeeManagement a = new EmployeeManagement();
	public void run() {
		int menu = 0;
		int empMenu = 0;
		do {
			printMenu();
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				empMenu();
				empMenu = sc.nextInt();
				switch (empMenu) {
				case 1:
					//사원 등록
					EmployeeManagement.empCreate();
					break;
				case 2:
					//사원 조회
					a.empPrint(Employee);
					break;
				case 3:
					//사원 수정
					break;
				case 4:
					//사원 삭제
					break;
				default:
					System.out.println("잘못된 메뉴 선택입니다.");
					//예외
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
			}
		} while (menu != 5);

	}

	private void empMenu() {
		System.out.println("=============================[사원 관리 메뉴]=============================");
		System.out.println();
		System.out.print("1. 사원 등록  |");
		System.out.print(" 2. 사원 조회  |");
		System.out.print(" 3. 사원 수정  |");
		System.out.println(" 4. 사원 삭제");
		System.out.println();
		
	}

	public static void printMenu() {

		System.out.println("============================[회사 관리 프로그램]============================");
		System.out.println();
		System.out.print("1. 사원 관리  |");
		System.out.print(" 2. 회사 제품 관리  |");
		System.out.print(" 3. 협력사 관리  |");
		System.out.print(" 4. 회사 프로젝트 관리  |");
		System.out.println(" 5. 종료");
		
	}

}
