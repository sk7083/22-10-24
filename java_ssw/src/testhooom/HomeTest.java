package testhooom;

public class HomeTest {
	public static void main(String[] args) {
		
		int arr[] = {};
		System.out.print("arr[] 배열의 값은 : ");
		printArray(arr);
		
		contains(arr, 5);
	}
//=========================================================================	
	/* 기능 		: 배열의 값을 출력하는 메소드
	 * 매개변수	: int arr[]
	 * 리턴타입	: 없음 => void
	 * 메소드명	: printArray
	 * */

	public static void printArray(int arr[]) {
		if (arr == null) {		// 배열 arr가 null일 경우
			return;				// 값을 리턴하겠다. (메소드 종료)
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
//=========================================================================	
	/* 기능 		: 배열의 값을 출력하는 메소드
	 * 매개변수	: int arr[]
	 * 리턴타입	: 없음 => void
	 * 메소드명	: printArray
	 * */	
	public static int countArray(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
			//배열 arr1이 null이거나 또는 배열 arr2가 null일 경우
			return 0;		//값을 0으로 리턴하겠다. (메소드 종료)
		}
		int count = 0;
		for (int tmp : arr1) {
			if (contains(arr2, tmp)) {
				count++;
			}
		}
		return count;
	}
//=========================================================================	
	/* 기능 		: 정수 값이 배열에 존재하고 있는지를 판단하는 메소드
	 * 매개변수	: int []arr, int num
	 * 리턴타입	: boolean
	 * 메소드명	: contains
	 * */	
	public static boolean contains(int [] arr, int num) {
		if(arr == null || arr.length == 0) {
			//배열 arr가 null이거나 또는 배열 arr의 [크기]가 0일 경
			System.out.println("arr[]의 값이 null이거나 arr.length가 0입니다.");
			return false;	//false 값을 리턴하겠다. (메소드 종료)
		}
		for(int tmp : arr) {	//배열 arr의 값들을 정수 tmp에 값을 내보냄
			if(num == tmp) {	//만약 num의 값이 tmp와 같다면
				System.out.println(num+" 값이 arr[]안에 존재합니다.");
				return true;	//true을 리턴하겠다. (메소드 종료)
			}
		}
		System.out.println(num+" 값이 arr[]안에 존재하지 않습니다.");
		return false;
	}
//=========================================================================
	public static void printMenu(String ... strs) {
		for(int i = 0; i< strs.length; i++) {
			/*
			System.out.print(strs[i]);
			if (i != strs.length - 1) {
				//마지막이 아닐 경우 
				System.out.println();
			} */
			System.out.print(strs[i] + (i!= strs.length-1?"\n": ""));
			//위 주석을 이 한줄로 조건 선택 연산자로 구현 가능
		}
	}
	
	
//=========================================================================

}
