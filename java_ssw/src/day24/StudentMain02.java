package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.RuntimeErrorException;



public class StudentMain02 {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 학생 정보를 관리 프로그램을 작성하세요.
		 * 1. 학생 추가(이름, 학년, 반, 번호)
		 * 2. 학생 출력
		 * 3. 종료
		 * e[])
		 * - 프로그램 시작 전 학생 정보를 읽어오는 기능 추가 (load)
		 * - 프로그램 종료 전 학생 정보를 저장하는 기능 추가 (save)
		 * */
		//inputStream
//===================================================	
		int data = 0;
//		try {
//			File file = new File("sunwoo.txt");
//			FileOutputStream fos = new FileOutputStream(file);
//			  while((data = System.in.read()) != -1) {
//	                // 입력받은 내용을 파일 내용으로 기록한다.
//	                fos.write(data);
	                
			ArrayList<Student> list = new ArrayList<Student>();
			int menu = 0;

			// load(list, );
			do {
				printMenu(menu);
				
				menu = sc.nextInt();
				runMenu(list, menu);
//===================================================

//				fos.write(runMenu(list, menu));
			} while (menu != 3);
	}
			// save(list, fileName);
//			fos.close();
//===================================================		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	private static void runMenu(ArrayList<Student> list, int menu) {
		switch (menu) {
		case 1:
			//학생 추가
			addStudent(list);
			break;
		case 2:
			//학생 출력
			printStudent(list);
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		case 4:
			printList(list);
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	private static void printStudent(ArrayList<Student> list) {
		if(list == null) {
			throw new RuntimeException("예외 : 등록된 학생이 없습니다");
		}
		if(list.size() == 0) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		System.out.println("==========등록된 학생 목록==========");
		
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		
	}
	private static ArrayList<Student> addStudent(ArrayList<Student> list) {

		//1. 학생 추가(이름, 학년, 반, 번호)
		System.out.println("학생 정보를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		System.out.println("반 : ");
		int classNum = sc.nextInt();
		System.out.println("번호 : ");
		int num = sc.nextInt();
		Student stu = new Student(name, grade, classNum, num);
		list.add(stu);
		System.out.println("학생이 등록되었습니다.");
		return list;
	}
	private static void printMenu(int menu) {
		System.out.println("===============메뉴===============");
		System.out.print("1. 학생 추가  |");
		System.out.print(" 2. 학생 출력  |");
		System.out.print(" 3. 종료  |");
		System.out.println(" 4. Test");
	}
	
	public static void printList(ArrayList<Student> list) {
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	

	
}
