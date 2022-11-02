package day08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodLottoEx01 {

	public static void main(String[] args) {
		//
//=======================================================
		//문제 풀이 (출력)
		int min = 1, max = 45;
		int size = 6;
		//로또 번호 생성
		int [] lotto = createRandomArray(min, max, size);
		//로또 번호 정렬
		Arrays.sort(lotto);
		//로또 번호 출력
		System.out.print("로또 번호 : ");
		printArray(lotto);
//=======================================================		
		int bonus;
		//보너스 번호 출력하는 코드 (복권 번호와 겹쳐선 안됨)

		do {
			bonus = random (min, max);
		} while(contains(lotto, bonus));
		System.out.println("보너스 번호 : "+bonus);
//=======================================================
		//사용자 로또 번호 입력받는 코드
		int []user = new int[size];
		System.out.print("입력 번호 : ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< user.length; i++) {
			user[i] = sc.nextInt();
		}
		sc.close();
//=======================================================
		//당첨 등 수를 알려주는 코드를 작성하세요. 단, 메소드를 이용할 것.
		int rank = getRank(lotto, bonus, user);	//등수 체크
		printRank(rank);						//등수 출력
		
//=======================================================
	}
//=======================================================
		//문제 풀이 (메소드)
//=======================================================	
		//교수 풀이 (공부 필요)
		/* 기능 		: 주어진 두 배열에서 일치하는 숫자의 개수를 알려주는 메소드
		 * 매개변수 	: 두 배열 => int []arr1, int []arr2
		 * 리턴타입	: 일치하는 숫자의 개수 => 정수 => int
		 * 메소드명	: countLotto
		 * */
	
		public static int countLotto(int[] arr1, int[] arr2) {
			if (arr1 == null || arr2 == null) {
				return 0;
			}
			int count = 0;
			for (int tmp : arr1) {
				if (contains(arr2, tmp)) {
					count++;
				}
			}
			return count;
		}

//=======================================================
	// int arr[]의 배열 값을 출력하는 메소드

	public static void printArray(int arr[]) {
		if (arr == null) { // arr안에 값이 있으면 null
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//=======================================================
		//랜덤 숫자를 만드는 메소드
	
		public static int[] createRandomArray(int min, int max, int size) {
			if (max - min + 1 <= size) {
				return null; // 예외처리용 코드
			}
			int arr[] = new int[size];	//arr[]는 size(직접 입력)의 크기를 가진 배열.
			// => i는 0부터; i가 배열의 크기보다 작을 때까지; 증감식이 없으므로 무한 루프
			for (int i = 0; i < arr.length;) {
				// 랜덤한 수를 배열 i번지에 저장
				// => 랜덤한 수를 r에 저장
				int r = random(min, max);
				// 배열에 r이 없으면 [배열 i번지에 r을 저장한 후, i를 1증가]
				if (!contains(arr, r)) { // contains메소드 부정
					arr[i] = r; // 배열에 r 값을 넣겟다.
					i++;
				}

			}
			return arr;
		}
//=======================================================
		//최소값과 최대값 사이에 랜덤한 수를 생성하는 메소드

		public static int random(int min, int max) {
			if (min > max) { // 순서가 바뀌엇을 경우에도 제대로 처리 가능하게하는 코드
				int tmp = min; // min ~ max 가 아닌 max ~ min인 경우
				min = max;
				max = tmp;
			}
			return (int) (Math.random() * (max - min + 1) + min);

		}
//=======================================================
	
	public static boolean contains(int [] arr, int num) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		for(int tmp : arr) {
			if(num == tmp) {
				return true;
			}
		}
		return false;
	}
//===================교수 풀이==============================
	//등수 판별하는 메소드
	
	/* 기능 		: 로또 번호(보너스 번호 포함)와 입력번호가 주어지면 등수를 알려주는 메소드
	 * 매개변수	: 로또 번호, 입력 번호 => int []lotto, int bonus, int []user
	 * 리턴타입	: 등수 => 정수 => int
	 * 메소드명	: getRank
	 */
	
	public static int getRank (int []lotto, int bonus, int []user) {
		int count = countLotto(lotto, user);	//**countLotto 일치하지않는 메소드
		switch (count) {
		case 6:	return 1;	//return은 메소드를 빠져나가는 역할이기에 break가 필요없음
		case 5:	return contains(user, bonus) ? 2 : 3;
		case 4:	return 4;
		case 3:	return 5;
		default: return -1;
		}
	}

	
	
	
	/* 기능 		: 등수가 주어지면 등수를 콘솔에 출력하는 메소드 (몇번 당첨됐는지 카운팅)
	 * 매개변수	: 등수 => 정수 => int rank
	 * 리턴타입	: 없음 => void
	 * 메소드명	: printRank
	 */
	public static void printRank(int rank) {
		switch(rank) {
		case 1:		System.out.println("1등"); break;
		case 2:		System.out.println("2등"); break;
		case 3:		System.out.println("3등"); break;
		case 4:		System.out.println("4등"); break;
		case 5:		System.out.println("5등"); break;
		case -1:		System.out.println("꽝!"); break;
		}
	}
}
