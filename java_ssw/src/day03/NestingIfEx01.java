package day03;

public class NestingIfEx01 {

	public static void main(String[] args) {
		//중첩 if문을 이용한 2,3,6의 배수 예제
		int num = 3;
		
		//2의 배수 체크
		
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num + "는 6의 배수");
			}
			else {
				System.out.println(num + "는 2의 배수");
			}
		} else if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수");
		} else {
			System.out.println(num + "2,3,6의 배수가 아니다.");
		}

	}

}
