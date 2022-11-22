package day22;

public class ThreadEx01 {

	public static void main(String[] args) {
		//Thread => class 타입
		Thread t = Thread.currentThread();
		System.out.println("현재 쓰레드 명 : " + t.getName());
		
		Thread01 t1 = new Thread01();
		//메소드 run을 가져와서 실행하는 것이 아닌 t1.start(); 형태로 실행
		t1.start();
		//밑에 for문을 통해 실행을 해도 위에서 선언한 t1이 먼저 실행 후에
		//밑에 for문이 작동하는 것이 아닌 "동시"에 진행됨
		for(int i =0; i<1000; i++)
			System.out.print("|");
	}

}

//Thread를 쓰기 위해선 반드시 override를 해야함
class Thread01 extends Thread{
	
	@Override
	public void run() {
		for(int i =0; i<1000; i++) {
			System.out.print("-");
		}
	}
}