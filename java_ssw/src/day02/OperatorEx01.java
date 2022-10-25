package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		//!(Not)연산자 : 참 or 거짓인 값(변수, 리터럴, 조건식) 앞에 옴
		// *정수 및 실수는 올 수 없음 (ex : double, int)
		boolean isMale = true;
		boolean isFemale = false;
		System.out.println("남성입니까? : " + isMale+","+!isFemale);
		System.out.println("남성입니까? : " + !isMale+","+isFemale);
	}

}
