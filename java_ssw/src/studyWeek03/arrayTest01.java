package studyWeek03;

import java.util.ArrayList;
import java.util.HashMap;

import studyWeek02.Student;

public class arrayTest01 {
	public static void main(String[] args) {
		ArrayList<String> arr01 = new ArrayList<String>();
		int iStr = 1;
		arr01.add(String.valueOf(iStr));
		arr01.get(0);
		
		
		ArrayList<Student> arr02 = new ArrayList<Student>();
		Student stu = new Student();
		stu.setNum(1);
		stu.setName("오");
		arr02.add(stu);
		System.out.println(arr02.get(0).getNum());
	//	System.out.println(arr02.get(0).getName());
		//ArrayLsit <Student> list = new ArrayLsit <Student>
//		ArrayList<ArrayList <Student>> bigBox = new ArrayList<ArrayList <Student>>();
//		for(int i =0; i<bigBox.size(); i++) {
//			
//		}
		//학교안에 반안에 학생.
		
		//반 3개. 학생 3~4명.
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		//map<Key,Value>
		//map.get(Key) -> Value
		//map.put(Key,Value);
		//put 할때 key값이 존재 할경우 덮어쓰기됨.
		//맵은 Size는 있는데 인덱스를 이용해서 값 못가져옴.
//		map1.put("1번", 1);
//		System.out.println(map1.size());
//		map1.put("2번", 200);
//		System.out.println(map1.get("2번"));
//		map1.put("2번", 300);
//		System.out.println(map1.get("2번"));
//		map1.put("2번", 400);
//		System.out.println(map1.get("2번"));
//		map1.put("2번", 500);
//		System.out.println(map1.get("2번"));

		
		HashMap<String, String> member = new HashMap<String, String>();
		member.put("이름", "신선우");
		member.put("나이", String.valueOf(27));
		member.put("핸드폰번호", "010-4443-4324");
		member.put("키", String.valueOf(145.76));
		
		System.out.println("이름 :"+member.get("이름"));
		System.out.println("나이 :"+(Integer.parseInt(member.get("나이"))+1));
		System.out.println("핸드폰번호 : "+member.get("핸드폰번호"));
		System.out.println("키 :"+member.get("키"));
		
		ArrayList<HashMap<String, String>> ban = new ArrayList<HashMap<String,String>>();
		ban.add(member);
		System.out.println(ban.get(0).get("키"));
		
		HashMap<Integer, Student> stuMap = new HashMap<Integer, Student>();
		Student sstu = new Student();
		sstu.setName("학생");
		stuMap.put(1, sstu);
		if(stuMap.get(1).getName().equals("학생")){
			// Map안에 Student의 name이 "학생"일때
		}
		
	
	
	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
