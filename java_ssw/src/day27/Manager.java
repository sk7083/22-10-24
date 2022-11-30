package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public static Scanner sc = new Scanner(System.in);
	static int num = 0;
	
	private String category;

	public Manager(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Manager() {

	}
	
	@Override
	public String toString() {
		return " category=" + category + "]";
	}

	public static ArrayList<Manager> addCategory(ArrayList<Manager> categoryList) {
		System.out.println("카테고리명 : ");
		String category = sc.nextLine();
		
		Manager cateList = new Manager(num+". "+category);
		categoryList.add(cateList);
		num++;
		return categoryList;
	}
	
	public static ArrayList<Manager> modifyCategory(ArrayList<Manager> categoryList) {
		for(Manager tmp : categoryList) {
		System.out.println(categoryList);
		}
		for(int i=0; i<categoryList.size(); i++) {
		System.out.println("카테고리 선택 : ");
		int index = sc.nextInt();
		System.out.println("내용 입력 : ");
		String update = sc.nextLine();
		categoryList.set(index+1, new Manager(update));
		}
		System.out.println("수정된 내용 : "+categoryList);
		return categoryList;
	}
}
