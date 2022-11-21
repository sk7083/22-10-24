package studyWeek03;

import java.util.ArrayList;
import java.util.HashMap;

import studyWeek02.Student;

public class arrayTest01 {
	public static void main(String[] args) {
		ArrayList<String> arr01 = new ArrayList<String>();
		int iStr = 1;
		//List arr01에 iStr의 값을 넣으려했으나, arr01 타입은 String이기에
		//정수타입인 iStr을 String.valueOf(iStr)을 이용하여 String타입으로 변환
		//이후 arr01.add(iStr)을 통하여 리스트에 저장.
		arr01.add(String.valueOf(iStr));
		//get(int index)은 인자로 인덱스를 받습니다.
		// 괄호 안에 (0)은 0 인덱스번호에 리스트 값을 의미.
		//위에서 iStr을 넣엇기에, 0번 인덱스의 값은 1이다.
		arr01.get(0);	//리스트의 (int index)괄호 안 해당 인덱스의 값을 불러옴
		arr01.add(1, "1번지에 넣음");
		System.out.println(arr01);
		System.out.println("================================");
		//List 타입이 class<Student>인 arr02라는 이름을 가진 리스트 생성
		ArrayList<Student> arr02 = new ArrayList<Student>();
		//Student라는 class를 사용하기 위해 메모리상에 인스턴스하여
		//래퍼런스 변수(메모리 상에 생성된 인스턴스를 가리킴) 현재는 stu를 이용하여
		//Student class를 사용
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
