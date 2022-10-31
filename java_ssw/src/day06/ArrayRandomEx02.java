package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRandomEx02 {

	public static void main(String[] args) {
		/* 랜덤으로 1~9 사이의 숫자를 중복되지 않게 3개 생성하여 배열에 저장하는 코드
		 * 
		 */
		
		//강사 풀이
		
		int size = 3;
		int arr[] = new int[size];	//랜덤 수를 저장할 배열
		int cnt = 0;				//저장된 랜덤 수의 개수
		int min = 1, max = 9;		//랜덤 수 범위

		
		//배열에 저장된 중복되지 않은 수가 3개가 될때까지 반복해야함. 
		//(저장된 숫자가 3보다 작을때까지(3번 동작 => 3자리이기 때문에))
		while(cnt < 3) {
			//랜덤한 수 생성
			int r = (int) (Math.random()*(max - min + 1)+min);
			
			boolean isDuplicatde = false;
			//배열에 저장된 수 중에서 랜덤한 수와 일치하는 숫자가 있는지 없는지 확인하여
			//저장된 숫자 개수만큼 반복 => i는 0번지부터 저장된 개수보다 작을때까지
			for(int i=0; i < cnt; i++) {
				//배열에 저장된 숫자개수만큼 확인
				//i번지에 있는 숫자와 랜덤 수가 같으면 isDuplicatde를 true로
				if(arr[i] == r) {
					isDuplicatde = true;
				}
			}
			//있으면 다시 처음으로,
			//isDuplicatde가 true이면
			if(isDuplicatde) {
				continue;
			}
			//없으면 배열에 저장하고, 저장된 개수 1 증가
			//isDuplicatde가 false면
			
			//위에 continue가 있어서 가능한 코드, 없으면 else 쓸 것.
				arr[cnt] = r;	//arr[cnt++] = r; 도 가능
				cnt++;
			
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		/* (오답)	
		 
		//랜덤한 숫자를 저장할 배열
		int ran1[] = new int[3];

		// min ~ man 설정
		int min = 1;
		int max = 9;
		
	

		// 랜덤을 생성하는 코드
		// 3번 반복
		for (int i = 0; i < 3; i++) {
			int ran = (int) (Math.random() * (max - min + 1) + min);
			boolean check = true;
			for(int j=0; j<ran1.length; j++) {
				if(ran1[i]==ran) {
				i--;
				check = false;
				}
			}
		}
		*/
		
		
	}

}
