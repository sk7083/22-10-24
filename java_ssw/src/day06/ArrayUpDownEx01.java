package day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		/* up down 게임을 무조건 3회 반복해서 플레이하고,
		 * 각 게임당 맞춘 횟수를 배열에 저장 후
		 * 출력하는 코드
		 */
	
		
		/* 오답
		 
		int max=100;
		int min=1;
		int a;
		int r;
		int arr[] = new int[3];
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {	//게임을 3판 진행
//===============================================게임 한판		
		r = (int)(Math.random()*(max - min + 1)+min);
		System.out.println("랜덤한 수 : " + r);
		while (true) {
			for(int j=0; j<arr.length; j++) {
				System.out.println("숫자를 입력하세요 : ");
				int b = sc.nextInt();	//사용자가 숫자 입력
				
				if(arr[j] == b){
					System.out.println("정답");
					continue;
				} else if(b<r) {
					System.out.println("UP");
				} else if(b>r) {
							System.out.println("DOWN");
			}
				
		}
		}
	}
		sc.close();
		
		*/
//=========================================================			
		/* up down 게임을 무조건 3회 반복해서 플레이하고,
		 * 각 게임당 맞춘 횟수를 배열에 저장 후
		 * 출력하는 코드
		 */
		
		int coin = 3;
		int record[] = new int[coin];
		int min = 1, max = 100;
		Scanner sc = new Scanner(System.in);
		
		while(coin-- > 0) {
			int r = (int)(Math.random()*(max - min + 1)+min);
			System.out.println(r);
			System.out.println(min + " ~ "+max+ "사이의 랜덤한 수를 맞추세요.");
			int num;
			int tryCnt = 0;
			do {
				tryCnt++;
				System.out.print("숫자 입력 : ");
				num = sc.nextInt();
				if(num==r) {
					System.out.println("정답입니다.");
					record[record.length-coin-1] = tryCnt;	//시도한 횟수
					break;
				} else if(num<r) {
					System.out.println("UP");
				} else if(num>r) {
					System.out.println("DOWN");
				}
			
			}while(r != num);
		}
		for(int i=0; i<record.length; i++) {
			System.out.println(i+1+"번째 게임 횟수 : "+record[i]);
		}
		sc.close();
	}
}
