package day09;

public class AbstractionEx01 {

	public static void main(String[] args) {
			
			//std1 정보 입력 (학년, 반, 번호, 이름)
			Student std1 = new Student(1, 1, 1, "홍길동");
			//학생 정보 출력 print(메소드)
			std1.print();
			
			//국어, 영어, 수학 성적 수정 updateScore(메소드)
			std1.updateScore(50, 30, 45);
			//학생 정보 출력 print(메소드)
			std1.print();
	}

}

/* 학생 성적 관리 프로그램에서 필요한 학생 클래스를 만들어 보세요.
 * 학생은 학년, 반, 번호, 이름, 성적을 관리
 * 성적은 국어, 영어, 수학 성적만 관리. 각 과목은 100점 만점을 기준으로 관리
 * 
 * 
 * 기능 : 학생 정보 출력 기능
 * 기능 : 성적을 수정하는 기능
 * 	- 국어
 * 	- 영어
 * 	- 수학
 * 	- 국어, 영어, 수학
 * 
 * 학생 정보의 초기값
 * 	- 학년 : 1 / 반 : 1 / 번호 : 1 / 이름 : 빈문자열 / 성적 : 0
 * */
//=====================교수 풀이================================
class Student{
	 //=====필드값=====
	private int grade;
	private int classNum;
	private int num;
	private String name;
	private int kor, eng, math;
	
	//=====메소드=====
	//학생 정보 출력
	public void print() {
		System.out.println(grade + "학년 "+ classNum + "반 "+num+" 번"+name);
		System.out.println("국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
	}
	
	//국어 성적 수정
	public void updateKor(int kor1) {
		kor = kor1;
	}
	
	//영어 성적 수정	
	public void updateEng(int eng1) {
		eng = eng1;
	}
	
	//수학 성적 수정	
	public void updateMath(int math1) {
		math = math1;
	}
	//국어, 영어, 수학 성적 수정 
	public void updateScore(int kor1, int eng1, int math1) {
		updateKor(kor1);
		updateEng(eng1);
		updateMath(math1);
	}
	
	//=====생성자=====
	//초기값 설정
	public Student() {
		grade = 1;
		classNum = 1;
		num = 1;
		name = " ";
	}
	//현재 생성자 오버로딩을 사용한 상태임
	public Student(int grade1, int classNum1, int num1, String name1) {

		grade = grade1;
		classNum = classNum1;
		num = num1;
		name = name1;
	}
	
	
}


