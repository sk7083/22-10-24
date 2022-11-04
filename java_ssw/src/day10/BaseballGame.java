package day10;

import java.util.Arrays;

public class BaseballGame {
	private int []com;
	private int []user;
	private int strike;
	private int ball;

	
	public BaseballGame(int []com) {	//()값이 고정인 애
		this.com = Arrays.copyOf(com, com.length);	//깊은 복사 예제 3번 사용
	}
	
	//사용자가 숫자 입력
	public void setUser(int []user) {
		this.user = Arrays.copyOf(user, user.length);
		calculateResult();	//계산하도록 시킴
	}
	
	//내부에서 스트라이크와 볼을 판별 언제? 유저가 입력될때마다
	public void calculateResult() {
		calculateStrike();
		calculateBall();
	}
	
	//스트라이크를 판별
	private void calculateStrike() {
		int count = 0;
		//com가 3개의 랜덤 수 ex) 4 1 3 출력
		//이후 user가 3개가 아닌 4개를 출력할 경우 ex) 1 2 3 4
		//인덱스 번호 com[] 1 ~ 3번를 유저 1 ~ 3를 비교해야하는데
		//현재 1 ~ 4인 경우 비교할 대상이 없기에 오류가 발생
		//그렇기에 밑줄 처럼 인덱스 번호가 작은걸 우선으로 비교하게끔 코드를 작성
		int size = com.length < user.length ? com.length : user.length;
				for(int i =0; i<size; i++) {
					if(com[i] == user[i]) {
						count++;
					}
				}
				strike = count;
	}
	
	//볼 판별
	private void calculateBall() {
		int count = 0;
		for(int i = 0; i<com.length; i++) {
			for(int j = 0; j<user.length; j++) {
				if(com[i] == user[j] && i!=j) {
					//번지가 같은 애들이 없을 경우
					count++;
				}
			}
		}
		ball = count;
	}
	
	//스크라이크 및 볼 판별하여 결과 출력
	public void printResult() {
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
	
	
	public int getStrike() {
		return strike;
	}
	
	
	
}
