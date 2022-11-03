package day09;

 /*메뉴
		 * 1. 학생 추가
		 * 2. 학생 성적 추가
		 * 3. 학생 정보 출력
		 * 4. 프로그램 종료
*/
class HighStudent{
	 //=====필드값=====
	private int grade;
	private int classNum;
	private int num;
	private String name;
	private int kor, eng, math;
	
	//=====메소드=====
	//학생 정보 출력
	public void print() {
		System.out.println(grade + "학년 "+ classNum + "반 "+num+"번 "+name);
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
	public HighStudent() {
		this(1,1,1,"");
	}
	//현재 생성자 오버로딩을 사용한 상태임
	public HighStudent(int grade1, int classNum1, int num1, String name1) {

		grade = grade1;
		classNum = classNum1;
		num = num1;
		name = name1;
	}
	
	
}


