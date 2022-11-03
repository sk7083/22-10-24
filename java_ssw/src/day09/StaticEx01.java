package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		KiaCar k1 = new KiaCar("모닝");
		KiaCar k2 = new KiaCar("레이");
		KiaCar k3 = new KiaCar("k3");
		k1.print();
		k2.print();
		k3.print();
		k1.name = "k5";
		//k1.logo = "Kia";
		KiaCar.logo = "Kia";
		System.out.println("===============");
		k1.print();
		k2.print();
		k3.print();
		
	}

}

class KiaCar{
	public static String logo = "KIA";	//필드(매개변수) static 선언
	public String name;
	
	public KiaCar(String name) {	//생성자
		this.name = name;
	}
	
	public void print() {
		System.out.print(logo);
		System.out.println(" : "+name);
	}
	
	public static void printLogo() {
		System.out.print(logo);			//Logo는 위에 static을 선언햇기에 사용 가능
		//System.out.println(" : "+name);	//(에러발생)name은 객체필드이기에 스태틱으로 호출이 불가능
	}
}