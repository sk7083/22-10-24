package day05;

public class ForEx01 {

	public static void main(String[] args) {
		
		int i;
		for(i=1; i<=5; i++); //<= 끝에 ; 때문에 조건문이 끝나는 순간 for문은 끝나게됨
		{					//그렇기에 이 중괄호는 의미가 없어짐
			System.out.println(i);
		}
		
		i = 5;
		if(i % 2 == 0);		//<= ; 때문에 if문 실행문이 짝수 출력이 아니라 없음
		//i값과 상관없이 짝수가 출력
		{
			System.out.println("짝수");
		}
		//에러 발생, else는 if문이 필요한데, if문이 없어서 에러발생
		//else { 에러 발생
			
		//}
		
		//조건문, 반복문은 실행문이 1줄이면 {}가 생략이 가능
		for(i=1; i<=5; i++);
		System.out.println(i);
	}

}
