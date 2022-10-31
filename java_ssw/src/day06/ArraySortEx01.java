package day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

public class ArraySortEx01 {

	public static void main(String[] args) {
		//버블 정렬을 이용한 배열 정렬
		int arr[] = {1,3,5,7,2,8,6,9};
		for(int i =0; i<arr.length-1; i++) {	//행 담당
			for(int j=0; j<arr.length-1-i; j++) {//열 담당
				if(arr[j] > arr[j+1]) {	//등 수 바꾸기
					int tmp = arr[j];	//tmp(제 3자의 값)값을 -> arr[j]에게
					arr[j] = arr[j+1];	//arr[j]값을 -> arr[j+1]에게
					arr[j+1] = tmp;		//arr[j+1]값을 -> tmp에게
					
					
					//이렇게 하면 덮어쓰기가 되기에 수를 뒤바꿀수없음
					//arr[j] = arr[j+1];	//j :arr[j+1]      j+1 : arr[j+1]
					//arr[j+1] = arr[j];	//j :arr[j+1]      j+1 : arr[j+1]
				}
			}
		/*	for(int tmp : arr) {
				System.out.print(tmp + " ");
			}
			*/	//여기에 입력 시 정렬되는 과정을 볼 수 있음.
		}
		System.out.println("================");
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println("================");
		
		int arr2 [] = {9,8,7,6,5,4,3,2};
		Arrays.sort(arr2);				//심플하게 정렬하는 코드
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println("================");
		Integer arr3 [] = {8,9,7,6,5,4,3,2};
		Arrays.sort(arr3,Collections.reverseOrder());	//역순으로 할때
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}

}
