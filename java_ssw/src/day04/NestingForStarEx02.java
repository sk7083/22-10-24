package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */

//==================================================
		/* 좌측에 붙은 삼각형
		for(int i=0; i<5; i++) {
			for(int e=0; e<=i; e++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
//==================================================
		/* 우측에 붙은 삼각형
		for(int a=1; a<=5; a++) {
			
			for(int s=0; s<5-a; s++) {
				System.out.print(" ");
			}
			
			for(int d=0; d<a; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
//==================================================
		//피라미드
		/*
		for(int f=0; f<5; f++) {
			
			for(int g=1; g<5-f; g++) {
				System.out.print(" ");
			}
			
			for(int h=0; h<f*2+1; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
//==================================================
		//역 피라미드
		/*
		int num = 5;
		
		for(int j=0; j<num; j++) {			//5층 완성
											//0 1 2 3 4
			for(int y=0; y<j; y++) {		//0 1 2 3 4
				System.out.print(" ");
			}
			
			for(int k=0; k<num-(j*2); k++) {		//9 7 5 3 1
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		*/
		
		
	}

}
