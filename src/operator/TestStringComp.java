package operator;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TestStringComp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name1 = "이순신";
		String name2 = "신신신";
	//문자열비교에==사용금지
		if( name1 == name2 ) // 데이터비교 x 주소비교 o
			System.out.println("같은 문자열입니다");
		else
			System.out.println("같은 문자열입니다");
		
		System.out.println("이름을 입력하세요");
		String name3 = in.nextLine();
		
		//문자열비교에==사용금지
		if( name1 == name3 ) //데이터비교 x 주소비교 o
			System.out.println("같은 문자열입니다2");
		else
			System.out.println("같은 문자열입니다2");
		//문자열비교 .equals() 함수로 비교해야 데이터를 비교한다.
//		int result = "A".compareTo("B");
		int result = "A".compareTo("B"); //-1
		System.out.println(result);
		
		
	}

}
