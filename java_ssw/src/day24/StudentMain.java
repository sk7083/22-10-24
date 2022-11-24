package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.RuntimeErrorException;



public class StudentMain {
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
			String fileName = "student.txt";
			ArrayList<Student> list = new ArrayList<Student>();
			int menu = 0;
			
			load(list, fileName);
			do {
				printMenu(menu);
				menu = sc.nextInt();
				runMenu(list, menu);
				
			} while(menu != 3);
			save(list, fileName);
//===================================================		
	}
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
		System.out.println(" 3. 종료");
	}
	
	private static void save(ArrayList<Student> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 : 등록된 학생이 없습니다");
	
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream(fileName))) {
			for(Student std : list) {
				oos.writeObject(std);
			}
			System.out.println("저장하기 완료.");
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "을 생성할 수 없어서 저장에 실패했습니다.");
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다.");
		}
	}
	
	private static void load(ArrayList<Student> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 : 등록된 학생이 없습니다");
	
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(fileName))) {
			while(true) {
				Student std = (Student)ois.readObject();
				list.add(std);
			}
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "이 없어서 불러오기에 실패했습니다.");
		} catch(EOFException e) {
			System.out.println("불러오기 완료");
		} catch (Exception e) {
			System.out.println("불러오기 실패");
		} 
		
	}
	
}
