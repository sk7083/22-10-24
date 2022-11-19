package studyWeek;

import java.util.Scanner;

public class Step01 {
	public static void main(String[] args) {
		//아파트 문제
		//test01();
		//test02();
		test03();
		//test04();
		//test05();
	}

	public static void test01() {
		//1. (1층 아파트)10개의 호수가 있는 건물에 호마다 입주하고있는 인원수 출력
		int[] apt = new int[] {1,2,3,4,2,1,3,1,1,2};
		for(int i=0; i<apt.length; i++) {
			System.out.println(i+1+"호실의 인원수는 "+apt[i]+"명 입니다.");
		}
	}
	
	public static void test02() {
		//2. (5층 아파트) 층 마다 10개의 호0수가 있는 건물에 호마다 입주하고있는 인원수 출력
		int[][] apt = new int[5][10];
		
	}
	
	public static void test03() {
		//3. (7층 아파트) 층 마다 2개의 호수가 있는 건물에 호마다 입주하고있는 사람이름 출력
		String[][] apt = new String[7][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<apt.length; i++) {
			System.out.println((i+1)+"층의 입주민을 입력.");
			for(int j=0; j<apt[i].length; j++) {
				apt[i][j] = sc.nextLine();
			}
		}
		
		System.out.println("================================");
		for(int a=0; a<apt.length; a++) {
			System.out.println((a+1)+"층");
			for(int j=0; j<apt[a].length; j++) {
				System.out.println((j+1)+"호실 = "+apt[a][j]);
			}
		}
	}
	
	public static void test04() {
		//4. (7층 아파트) 층 마다 2개의 호수가 있는 건물에 호마다 입주하고있는 사람이름(2명 이상)씩 출력
	}
	
	public static void test05() {
		//5. (10층 아파트) 층 마다 2개의 호수가 있는 건물에 호마다 입주하고있는 사람이름과 인원수 출력.
	}
	

	
		
	
	
	
	

	
	
}
