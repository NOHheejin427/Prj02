package condition;

import java.util.Date;
import java.util.Scanner;

public class TestGanji2 {
	public static String getDdi(int year) {
		String ddi = "";
		switch (year %12) {
		case 0: ddi = "원숭이"; break;
		case 1: ddi = "닭"; break;
		case 2: ddi = "개"; break;
		case 3: ddi = "돼지"; break;
		case 4: ddi = "쥐"; break;
		case 5: ddi = "소"; break;
		case 6: ddi = "호랑이"; break;
		case 7: ddi = "토끼"; break;
		case 8: ddi = "용"; break;
		case 9: ddi = "뱀"; break;
		case 10: ddi = "말"; break;
		case 11: ddi = "양"; break;
		}
		return ddi;
		
	}
	//프로그램진입점:EntryPoint
	public static void main(String[] args) {
		//표준입력장치:키보드System.in
		//표준입력장치:키보드System.out
		//표준에러출력장치:키보드System.err
		Scanner in = new Scanner(System.in);
		
		//올해의 띠
		Date now = new Date(); //java.util
		int year = now.getYear(); //126->2026
		year = year+1900;
		int month = now.getMonth() + 1; //(0~11)2->3
		System.out.println(year + "," + month);
		
		String ddi = "";
		//ddi = getDdi(2026);
		ddi = getDdi(year);
		/*
		 * 1. %d (Decimal) 용도: 정수(10진수)를 출력할 때 사용합니다. (byte, short, int, long) 예시:
		 * System.out.printf("나이: %d세", age); → 나이: 26세 2. %c (Character) 용도: 문자 하나를 출력할
		 * 때 사용합니다. (char) 예시: char gender = '여'; System.out.printf("성별: %c", gender); →
		 * 성별: 여 3. %o (Octal) 용도: 정수를 8진수로 출력할 때 사용합니다. 예시: System.out.printf("%o",
		 * 10); → 12 (10진수 10은 8진수로 12) 4. %s (String) 용도: 문자열을 출력할 때 사용합니다. 가장 많이 쓰입니다.
		 * 예시: System.out.printf("이름: %s", name); → 이름: 아이유
		 */
		System.out.printf("올해연도:%d %s띠\n", year, ddi);
		
		//태어난 연도 띠 출력
		System.out.println("태어난 연도르 입력하세요");
		int birthYear = in.nextInt();
		
		ddi = TestGanji2.getDdi(birthYear);

		ddi = getDdi(birthYear);
		//클래스.함수
		
		System.out.printf("태어난연도:%d %s띠", birthYear, ddi);
		
	}

}
