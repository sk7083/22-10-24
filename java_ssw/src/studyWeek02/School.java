package studyWeek02;

public class School {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setNum(1);
		s1.setName("짱구");
		s1.setEng(0);
		s1.setKor(0);
		s1.setMath(0);
		s1.message = "마사지";
		
		Student s2 = new Student(2,"철수",10,30,20);
		Student s3 = new Student(3,"유리");
		System.out.println(s2);
		Dog dd = new Dog();
		dd.name();
		dd.sound();
		
		
	}
	
}
