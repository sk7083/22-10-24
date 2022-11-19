package studyWeek02;

public class Wrapper {
	public static void main(String[] args){
		String str = "1234";
		int iStr = Integer.parseInt(str);
		str = String.valueOf(iStr);
		double dStr = Double.parseDouble(str);
		
		String str2 = "   김 철수,철수   ";
		String str3 ="";
		System.out.println(str2.indexOf("수"));
		System.out.println(str2.lastIndexOf("수"));
		System.out.println(str2.equals("김철수철수"));
		System.out.println(str2.contains("김철"));
		System.out.println(str2.substring(3));
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
