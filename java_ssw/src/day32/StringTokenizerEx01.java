package day32;

import java.util.StringTokenizer;

public class StringTokenizerEx01 {
	public static void main(String[] args) {
		//정규표현식으로 적용 ,와 문자하나를 구분자로 봄
		String str = "abc,def,.ghi";
		
		//String의 split를 이용한 방법
		String [] arr = str.split(",.");
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		
		System.out.println("============================");
		
		//StringTokenizer를 이용한 방법
		
		//.또는 ,를 구분자로 봄
		StringTokenizer st = new StringTokenizer(str, ".,");
		//개수를 알려주는 .countTokens()
		System.out.println("개수 : " + st.countTokens());
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			System.out.println(tmp);
		}
		
		System.out.println("============================");
		
		//StringTokenizer를 이용한 방법 2
		//뒤에 true 추가할 경우 구분자를 포함해서 출력
		StringTokenizer st2 = new StringTokenizer(str, ".,", true);
		//개수를 알려주는(토큰 포함) .countTokens()
		System.out.println("개수 : " + st2.countTokens());
		while(st2.hasMoreTokens()) {
			String tmp = st2.nextToken();
			System.out.println(tmp);
		}
		
		
		
	}
}
