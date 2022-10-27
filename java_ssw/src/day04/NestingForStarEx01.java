package day04;

import java.util.Scanner;

public class NestingForStarEx01 {

	public static void main(String[] args) {
		/* *****
		 * *****
		 * *****
		 * *****
		 * ***** 찍기
		 * 
		 */
		
		
		for(int i=1; i<6; i++) {
			for(int e=0; e<6; e++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
