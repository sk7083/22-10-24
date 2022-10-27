package day04;

public class BreakPrimeNumberEx01 {

	public static void main(String[] args) {
		//6 => 5,4,3 역 순으로 약수인지 판단하되 처음 약수일 때 break
		
		int num = 2;
		int i;
		for(i=num-1; i>=1; i--) {
			if(num%i==0) {
				break;
			}
		}
		
		if(i==1) {
			System.out.println(num + "는 소수");
		} else {
			System.out.println(num + "는 소수 아님");
		}
	}

}
