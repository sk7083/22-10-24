package day12;

public class InterfaceEx01 {

	public static void main(String[] args) {
		//인터페이스를 통해 객체를 생성할 수 없다.
		//TvRemoteController tr = new TvRemoteController();
		//하지만 인터페이스 참조 변수에 객체를 저장할 수 있다.
		TvRemoteController remocon1 = new TvremoconA();
		//remocon1.print();
		((TvRemoconA)remocon1).print();
		TvRemoconA r2 = new TvRemoconA();
		r2.turn();
		for(int i=0; i<10; i++) {
			r2.channlUp();
		}
		
		for(int i=0; i<2; i++) {
			r2.channlDown();
		}

		r2.channl(15);

		for(int i=0; i<2; i++) {
			r2.volumnUp();
		}
		
		for(int i=0; i<2; i++) {
			r2.volumnDown();
		}
		
		
		r2.print();
	}

}
interface TvRemoteController{
	//전원 켜기
	//void turnOn();
	//전원 끄기
	//void turnOff();

	//전원 켜기/끄기
	void turn();
	//채널 변경(숫자)
	void channel(int channel);
	//채널 업
	void channelUp();
	//채널 다운
	void channelDown();
	//볼륨 업
	void volumnUp();
	//볼륨 다운
	void volumnDown();
}