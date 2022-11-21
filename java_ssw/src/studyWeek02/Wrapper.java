package studyWeek02;

public class Wrapper {
	public static void main(String[] args){
		String str = "1234";
		int iStr = Integer.parseInt(str);
		str = String.valueOf(iStr);
		double dStr = Double.parseDouble(str);
		
		String str2 = "김철수,철 수   ";
		String str3 ="Hello";
		//String 변수명.indexof("문자") ()괄호 안에 문자 값이 
		//변수명내에 존재할 경우 몇 번지에 존재하는지 알려줌  
		System.out.println("========================");
		System.out.println(str2.indexOf("철수"));
		//String 변수명.lastIndexOf("문자") ()괄호 안에 문자 값이 
		//변수명내에 존재할 경우 뒤에서부터 찾기 시작하여 몇 번지에 존재하는지 알려줌
		System.out.println(str2.lastIndexOf("수"));

		//String 변수명.equals("문자") 
		//()괄호 안에 문자 값이 변수명과 일치할 경우 true/false 판단을 함
		System.out.println(str2.equals("김철수,철수  "));
		//String 변수명.contains("문자")
		//()괄호 안에 문자 값이 변수명에 존재할 경우 true/false 판단을 함
		System.out.println(str2.contains("철 수"));
		//String 변수명.substring(int index)
		//()괄호 안에 int index의 번호부터 시작 문자를 자른다.
		System.out.println(str3.substring(3));
		System.out.println("========================");
		System.out.println(str2.substring(0,3));
		System.out.println(str2.replaceAll("철수", "유리"));
		System.out.println(str3.isEmpty());
		System.out.println(str3.equals(""));
		System.out.println(str2.trim());
		System.out.println(str2.replaceAll(" ", ""));
		String[] str4 = str2.split(",");
		System.out.println(str4[1]);
		
		
	}

}
