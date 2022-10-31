package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

	public static void main(String[] args) {
		/* 로또 번호를 랜덤으로 생성하고, 당첨번호를 입력하여 몇 등 당첨됐는지 출력하는 코드
		 * 숫자 범위 : 1 ~ 45
		 * 
		 * 1등 : 6개 맞춤
		 * 2등 : 5개 맞춤 + 보너스 번호
		 * 3등 : 5개 맞춤
		 * 4등 : 4개 맞춤
		 * 5등 : 3개 맞춤
		 * 로또 번호 : 번호 6개 + 보너스
		 */
		
		
		
		/* 오답
		int size = 6;
		int arr[] = new int[size];
		int cnt =0;
		
		int min = 1;
		int max = 45;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<6; i++) {		//6자리 출력
			//랜덤한 수를 생성
			int r = (int) (Math.random()*(max - min + 1)+min);
			boolean check = false;
			System.out.println();
			for(int j=0; j < cnt; j++) {
				if(arr[i] == r) {
					check = true;
				}
			}
			if(check) {
				continue;
			}
			arr[cnt] = r;
			cnt++;
		}
		sc.close();
		*/
		
//================================================================
		
		// 강사 풀이
		
		//랜덤으로 6개의 로또 번호 생성
		int size = 6;
		int lotto[] = new int[size];	//랜덤 수를 저장할 배열
		int cnt = 0;				//저장된 랜덤 수의 개수
		int min = 1, max = 45;		//랜덤 수 범위
		int go =0;
		int b =0;
		

		while(cnt < size) {
			int r = (int) (Math.random()*(max - min + 1)+min);
			boolean isDuplicatde = false;
			for(int i=0; i < cnt; i++) {
				if(lotto[i] == r) {
					isDuplicatde = true;
				}
			}
			if(isDuplicatde) {
				continue;
			}
			lotto[cnt] = r;
				cnt++;
		}
		System.out.println("로또 번호 확인 : ");
		for(int tmp : lotto) {
			System.out.print(tmp + " ");
		}
		//보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
		int bonus;
		while(true) {
			int r = (int) (Math.random()*(max - min + 1)+min);
			boolean isDuplicatde = false;
			for(int i=0; i <lotto.length; i++) {
				if(lotto[i] == r) {
					isDuplicatde = true;
				}
			}
			if(isDuplicatde) {
				continue;
			}
			bonus = r;
			break;
		}
		System.out.println("보너스 : "+bonus);
		
		//당첨 번호 6개를 입력 받음
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("당첨 번호 입력 : ");
		int user[] = new int[size];
		for(int i=0; i<size; i++) {
			user[i] = sc.nextInt();

			}
		sc.close();
		//일치하는 번호 개수를 구함(보너스 번호 제외)
		int samecnt = 0;
		for(int i = 0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i] == user[j]) {
					samecnt++;
				}
			}
		}
		
		//등 수 판별
		switch (samecnt) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			boolean isDuplicatde = false;
			for(int i=0; i < cnt; i++) {
				if(user[i] == bonus) {
					isDuplicatde = true;
				}
			}
			if(isDuplicatde) {
				System.out.println("2등");
			} else {
				System.out.println("3등");
			}
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default :
			System.out.println("꽝");
			break;
		}
		
		
	}

}

