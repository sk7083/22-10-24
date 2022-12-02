package day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
static Scanner sc = new Scanner(System.in);

/*
 *  *  - 제품 등록 (분류, 제품명, 수량, 구매 가격, 판매 가격)
	 *  - 제품 수정
	 *  - 제품 삭제
	 *  - 제품 구매(관리자가 구매, 입고)
	 *  - 제품 판매*/


	//제품 등록 메소드
	public static void addProduct(ArrayList<ProductManager> proList) {
		
		System.out.println("분류 : ");
		String sort = sc.nextLine();
		System.out.println("제품명 : ");
		String name = sc.nextLine();
		System.out.println("수량 : ");
		int num = sc.nextInt();
		System.out.println("구매가 : ");
		int buy = sc.nextInt();
		System.out.println("판매가 : ");
		int sell = sc.nextInt();
		
		
		
		ProductManager product = new ProductManager(sort, name, num, buy, sell);
		if(proList.contains(product)) {
			System.out.println("이미 등록된 제품입니다.");
		}
		proList.add(product);
	}
	
	//제품 수정 메소드
	public static boolean updateProduct(ArrayList<ProductManager> proList){
		//제품명 기준으로 불러올 예정
		
		
		
		return false;
	}

}