package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			//break를 만나면 증감식으로 가지 않고, 반복문을 빠져나감
			//A for문이 B for문을 감싸고 잇을 때, A for문에 break가 잇을 시
			//A for문안에 해당된 B for문은 역시 break 되버림
			System.out.println("Hello World");
			if(i==3) {
				break;
			}
		}
	}

}
