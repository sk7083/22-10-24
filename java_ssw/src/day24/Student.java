package day24;

import java.io.Serializable;

import lombok.Data;

@Data
//save하기위해 클래스 implements Serializable 한것
public class Student implements Serializable {
//밑에는 마우스 호버로 add 한거
	private static final long serialVersionUID = -5537501665358490456L;
	//학생 추가(이름, 학년, 반, 번호)
	
	private String name;
	private int grade, classNum, num;

	public Student(String name, int grade, int classNum, int num) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}
	public String toString() {
		return grade + "학년 " + classNum + "반 " + num + "번 " + name;
	}
}
