package CompanyManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);
	//사원 등록 메소드
	public static ArrayList<Employee> empCreate() {
		ArrayList<Employee> listEmp = new ArrayList<Employee>();

		System.out.println("이름 입력 : ");
		String empName = sc.next();
		sc.nextLine();
		System.out.println("이메일 입력 : ");
		String empEmail = sc.nextLine();
		System.out.println("연락처 입력 : ");
		String empPhone = sc.nextLine();
		System.out.println("직책 입력 : ");
		String job = sc.nextLine();
		System.out.println("부서 입력 : ");
		String empDepartment = sc.nextLine();
		int empNum = 1;
	
		Employee emp = new Employee(empName, empEmail, empPhone, job, empDepartment, empNum);
		listEmp.add(emp);
		
		return listEmp;
	}
	
	//사원 조회
	public void empPrint(ArrayList<Employee> listEmp){
		for(Employee tmp : listEmp) {
			System.out.println(tmp);
		}
	}
}
