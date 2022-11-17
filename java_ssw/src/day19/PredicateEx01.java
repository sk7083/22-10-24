package day19;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, "홍길동", 100, 90, 80));
		list.add(new Student(1, 2, 1, "임꺽정", 20, 30, 40));
		list.add(new Student(1, 1, 2, "고길동", 50, 60, 70));
		
		/* 1학년 1반 학생들을 출력하는 코드를 작성하세요.
		 * 1학년 2반 학생들을 출력하는 코드를 작성하세요.
		 * 1학년 학생들을 출력하는 코드를 작성하세요.
		 * */
		//print(list, 1,1);
		System.out.println("===========================");
		//print(list, 1);
		System.out.println("===========================");
		//print(list, (s)->s.getGrade()==1 && s.getClassNum()==1);
		//print(list, (s)->s.getGrade()==1);
		print(list, (s)->s.getName().charAt(0) == '홍');
	}
	public static void print(ArrayList<Student> list, int grade, int classNum) {
		for(Student tmp : list) {
			if(tmp.getGrade() == grade && tmp.getClassNum() == classNum) {
				System.out.println(tmp);
			}
		}
	}
	
	public static void print(ArrayList<Student> list, int grade) {
		for(Student tmp : list) {
			if(tmp.getGrade() == grade) {
				System.out.println(tmp);
			}
		}
	}
	
	public static void print(ArrayList<Student> list, Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
	
}
