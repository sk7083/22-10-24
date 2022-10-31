package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		/*랜덤으로 1~9 사이의 숫자를 3개 생성하여 배열에 저장하는 코드
		 * 
		 */
		
		//랜덤한 숫자를 저장할 배열
		int ran1[] = new int[3];
		
		//min ~ man 설정
		int min = 1;
		int max = 9;
		
		//랜덤을 생성하는 코드
		//3번 반복
		for(int i=0; i<ran1.length; i++) {
		ran1[i] = (int)(Math.random()*(max - min + 1)+min);
		}
		System.out.println(Arrays.toString(ran1));
		//정수를 입력받아 랜덤한 수에 있는지 없는지 확인해서 알려주는 코드를 작성하세요.
		
		/* 오답 (내가 푼 풀이)
		Scanner sc = new Scanner(System.in);	
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=0; i<ran1.length; i++) {
			if(num==ran1[i]) {
				System.out.println(ran1[i]+"은 있습니다.");
			}
			}
		System.out.println("해당 없음");
		*/
		
		
		//강사 풀이
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		boolean isDuplicated = false;//중복이 안됨으로 초기화
		
		for(int i=0; i<ran1.length; i++) {
			//i번지에 있는 값과 num가 같으면
			if(ran1[i] == num) {
				//중복됐다고 저장함
				isDuplicated = true;
				break;
			}
		}
		//중복 됐으면 있다고 출력하고 아니면 없다고 출력
		if(isDuplicated) {
			System.out.println(num + "가 있습니다.");
		} else {
			System.out.println(num + "가 없습니다.");
		}
		
		sc.close();
		
		}
	}


