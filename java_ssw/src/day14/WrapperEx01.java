package day14;

public class WrapperEx01 {

	public static void main(String[] args) {
		int num1 = 1;
		Integer num2 = num1;	//박싱(boxing) int -> Integer
		//num2 = null;	에러발생 num2 =null에 넣는건 가능 num2가 박싱을 통해 class가 됫기에
		int num3 = num2;	//언박싱(unboxing) Integer -> int
		//num2인 Integer 객체를 int로 언박싱하는 경우 num2가 null일 수 있어서 조심해야함.
		System.out.println(num3);
		
		//문자열을 정수로
		String str = "1234";
		System.out.println(str+1);
		int num4 = Integer.parseInt(str);	//문자열을 정수로 변환
		System.out.println(num4+1);
		
		
		//정수를 문자열로
		int num5 = 123;
		String str2 = Integer.valueOf(num5).toString();
		System.out.println(str2+1);
		
		//좀더 편한 방법
		String str3 = ""+num5;
		System.out.println(str3+1);
	}

}
