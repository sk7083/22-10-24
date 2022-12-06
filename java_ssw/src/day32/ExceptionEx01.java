package day32;

import javax.management.RuntimeErrorException;

public class ExceptionEx01 {

	public static void main(String[] args) {
		try {
			test();
			//System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println("예외 발생 : "+e.getMessage());
		}catch(Exception e) {
			System.out.println("예외 발생 : "+e.getMessage());
		}

	}
	
	public static void test() throws Exception  {
		//throw new RuntimeException("런타입 에러 발생");
		throw new Exception("예외 발생1");
	}

}
