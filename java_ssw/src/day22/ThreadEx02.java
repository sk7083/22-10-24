package day22;

public class ThreadEx02 {

	public static void main(String[] args) {
		// Thread => class 타입
		Thread t = Thread.currentThread();
		System.out.println("현재 쓰레드 명 : " + t.getName());

//		Thread t2 = new Thread(new Thread02());
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				System.out.print("|");
		});

	}

//Thread를 쓰기 위해선 반드시 override를 해야함
	class Thread02 implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.print("-");
			}
		}
	}
}