package day06;

public class ArrayCopyEx01 {

	public static void main(String[] args) {
		//배열의 얕은 복사 예제
		
		int arr1[] = new int[3];	//3의 크기를 지닌 arr1
		int arr2[] = arr1;			//arr2는 arr1과 같다(같은 3의 크기 배열)
		//arr1과 arr2 값 확인
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("0번지 : "+arr1[i]+ ","+ arr2[i]);
		}
		arr1[0] = 10;//arr1의 값만 10으로 변경
		System.out.println("==============");
		//arr1과 arr2 값 확인, arr1, arr2모두 10 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.println("0번지 : "+arr1[i]+ ","+ arr2[i]);
		}
		// System.out.println("arr1{"++i+"] = " + arr1[i] + ", arr2[" + i+ "] = "+ arr2[i]);
	}

}
