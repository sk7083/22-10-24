package day26;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {

	public static void main(String[] args) {
		InetAddress ia = null;
		
		
		try {
			//() 괄호 안에 도메인 명을 통해 ip주소를 얻는다.
			ia = InetAddress.getByName("localhost");
			System.out.println(ia);
			//naver에 ip 주소
			ia = InetAddress.getByName("www.naver.com");
			System.out.println(ia);
			//현재 내 pc ip 불러오는 방법
			ia = InetAddress.getLocalHost();
			System.out.println(ia);
			//네이버의 주소가 하나인지 확인하기 위해 getAllByName() 을 사용
			//이때 InetAddress [] 배열명 / 배열을 사용하여 확인 및 향상된 for문을 이용하여 배열값 전체 출력
			InetAddress [] ias = InetAddress.getAllByName("www.naver.com");
			for(InetAddress tmp : ias) {
				System.out.println(tmp);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
