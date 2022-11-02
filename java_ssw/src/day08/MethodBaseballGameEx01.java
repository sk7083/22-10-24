package day08;

import java.util.Scanner;

public class MethodBaseballGameEx01 {

	public static void main(String[] args) {
//===============================================================

		/* 문제 1 ~ 9 사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이 되고,
		 * 생성된 숫자를 맞추는 게임
		 * 
		 * 규칙)
		 * - 숫자가 같은 자리에 있으면 Strike
		 * - 숫자가 있지만 다른 자리에 있으면 Ball
		 * - 일치하는 숫자가 하나도 없으면 Out
		 * 
		 * 예시) (랜덤 숫자 : 5 9 8)
		 * 입력 : 1 2 3
		 * Out
		 * 입력 : 4 5 6
		 * 1Ball
		 * 입력 : 7 8 9
		 * 2Ball
		 * 입력 : 7 9 8
		 * 2Strike
		 * 입력 : 7 9 5
		 * 1S1B
		 * 입력 : 5 9 8
		 * 3S
		 * 게임 종료
		 */
//===============================================================
		//문제 풀이 (출력)
		
		int min = 1, max = 9, size = 3;
		int []com = createRandomArray(min, max, size);
		printArray(com);
		

		//2. 사용자가 숫자를 선택
		System.out.println("입력 : ");
		Scanner scan = new Scanner(System.in);
		
		
		//3. 판별
		int strike = 0, ball;
		do {
			int []user = scanArray(scan, size);
			// => 스트라이크를 판별하는 기능을 구현
			// => countLotto를 이용하여 일치하는 개수 - 스트라이크 개 수 : 볼의 개 수
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printGame(strike, ball);
			//2 ~ 3을 반복 (3 Strike가 될 때까지)
		} while(strike < 3);
		System.out.println("게임 종료.");
		scan.close();	
//===============================================================
	}	//main문 괄호 (끝)
//===============================================================
	/* 기능 : strike와 ball의 개수가 주어지면 콘솔에 결과를 출력하는 메소드
	 * @param strike 스트라이크 개수
	 * @param ball 볼의 개수
	 */
	public static void printGame(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		if (strike == 0 && ball == 0) {
			System.out.println("Out");
		}
		System.out.println();
	}
	
	
	/* 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수
	 * */
	public static int getStrike(int[] arr1, int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;	
			}
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int strike = 0;
		for(int i = 0; i<size; i++) {
			if(arr1[i]== arr2[i]) {
				strike++;
			}
		}
		
		return strike;
	}

	/* 기능 : 두 정수 배열이 주어지면 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수를
	 * 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수
	 * */
	public static int getBall(int []arr1, int []arr2) {
		if(arr1 == null || arr2 == null) {
			return 0;	
		}
		
		int ball = 0;
		int strike = getStrike(arr1, arr2);
		for(int num : arr1) {
			if(contains(arr2, num)) {
				ball++;	//일치하는 전체 개수
			}
		}
		return ball - strike;
	}
	
	
	
//===============================================================	
				//문제 풀이 메소드

	//1. 랜덤으로 세개의 수를 선택
	// => creatRandomArray 메소드 사용
	
	

/* 기능 		: Scanner가 주어지면 정수를 size개 만큼 입력받아 배열에 저장하고,
 * 			저장된 배열을 돌려주는 메소드
 * 매개변수	: Scaneer, size개 => Scanner sc, int size
 * 리턴타입	: 정수 배열 => in []
 * 메소드명	: scanArray
 * @param sc Scanner
 * @param size 입력받을 정수의 개수
 * @return 입력받은 값들이 저장된 배열
 * */

	public static int[] scanArray(Scanner scan, int size) {
		if (size <= 0) {
			return null;
		}
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

//이 아래는 가져온 메소드들

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

public static int countArray(int[] arr1, int[] arr2) {	//본래 countLotto 메소드
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
}
