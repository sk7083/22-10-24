package day19;

import java.util.ArrayList;
import java.util.function.Consumer;

import day14.Student;

public class ConsumerEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, "홍길동"));
		list.add(new Student(1, 2, 1, "임꺽정"));
		list.add(new Student(1, 1, 2, "고길동"));
		
		print(list, (a) -> System.out.println(a)); 
		
		print(list, (a) -> {
			System.out.println("학년 : " + a.getGrade());
			System.out.println("반 : " + a.getClass());
			System.out.println("번호 : " + a.getClassNum());

		});
		
	}
	public static void print(ArrayList<Student> list, Consumer<Student> con) {
		for(Student tmp : list) {
			con.accept(tmp);
		}
	}
}
