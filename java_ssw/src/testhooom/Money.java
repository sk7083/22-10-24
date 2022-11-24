package testhooom;

public class Money {
	//1번줄
	public static final String UNIT = "원";
	//이거 public 아님
	// 2번 줄
	private int money;
	
	
	
	//3번줄
	public Money(int money) {
		this.money = money;
	}
	

	


	//4번줄
	public int getMoney() {
		return money;
	}
	//4번줄
	public void setMoney(int money) {
		this.money = money;
	}
	


	//4번줄
	public static String getUnit() {
		return UNIT;
	}

	
	//5번줄 (마지막)
	public void print() {
		//이 안에는 정의되지 않음
		System.out.println(money + UNIT + "이 있습니다.");
	}
}
