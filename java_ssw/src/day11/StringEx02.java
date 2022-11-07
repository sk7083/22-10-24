package day11;

public class StringEx02 {

	public static void main(String[] args) {
		/* 문자열 str에 search가 몇번 등장하는지 확인하는 코드를 작성하세요. */
		String str = "Hello world! My name is Hong";
		String search = "o";

		// str에서 search가 있는 위치를 찾음
		// -1이 아니면 부분문자열을 추출하고, 카운터 +1
		// -일 경우 반복문 종료
		String tmp = str;
		int cnt = 0;
		while (true) {
			System.out.println(tmp);
			int index = tmp.indexOf(search);
			//tmp 중 가장 처음 search( = "o") 1번지에 있는 것을 탐색
			if(index == -1) {
				break;
			}
			tmp = tmp.substring(index + search.length());
			//+ search.length()가 없었다면 무한 루프에 빠짐
			
			cnt++;
		}
		System.out.println(str +" 에는 "+ search + "가" + cnt+" 번 있습니다.");

	}

}
