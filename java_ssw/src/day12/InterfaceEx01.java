package day12;

public class InterfaceEx01 {

	public static void main(String[] args) {
		//인터페이스를 통해 객체를 생성할 수 없다.
		//TvRemoteController tr = new TvRemoteController();
		//하지만 인터페이스 참조 변수에 객체를 저장할 수 있다.
		TvRemoteController remocon1 = new TvRemoteController() {
			
			@Override
			public void volumnUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumnDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void channelUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void channelDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void channel(int channel) {
				// TODO Auto-generated method stub
				
			}
		};
		//remocon1.print();
		//((TvRemoconA)remocon1).print();
		
		TvremoteControllerA r2 = new TvremoteControllerA();
		r2.turn();
		
		for(int i=0; i<10; i++) {
			r2.channelUp();
		}
		
		for(int i=0; i<2; i++) {
			r2.channelDown();
		}

		r2.channel(15);

		for(int i=0; i<2; i++) {
			r2.volumnUp();
		}
		
		for(int i=0; i<2; i++) {
			r2.volumnDown();
		}
		
		
		r2.print();
	}

}
