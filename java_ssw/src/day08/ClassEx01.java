package day08;

public class ClassEx01 {

	public static void main(String[] args) {
		//기본 생성자 호출
		Point pt = new Point();
		pt.print();
		
		pt.move(5, 3);	//좌표 이동 기능
		pt.print();		//좌표 출력 기능
		
		//생성자 오버로딩 호출
		Point pt1 = new Point(3,1);
		pt1.print();
		//복사 생성자 호출
		Point pt2 = new Point(pt1);
		pt2.print();
	}

}

/* 2차원 좌표평면의 점을 나타내는 클래스
 * - 필드
 * x좌표, y좌표
 * 
 * -메소드 (기능)
 * 좌표 출력 기능
 * 좌표 이동 기능
 * */
class Point {
	//필드
	private int x, y; //필드는 파란색 표시 //맴버 변수들은 기본적으로 초기화 되있음.
	
	//좌표 출력 기능 - 메소드
	public void print() {
		System.out.println("좌표: "+ x + " , "+ y);
	}
	
	//좌표 이동 기능 - 메소드
	public void move(int x1, int y1){
		x = x1; //내 필드의 있는 값을 변경할 경우엔 일반적으로 리턴값이 없음
		y = y1;
	}
	
	//생성자
	public Point() {
		x = 3;
		y = 3;
	}
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
}