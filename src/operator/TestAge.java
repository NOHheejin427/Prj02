package operator;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		//키보드로 데이터를 입력받아 data 처리
		//키보드를 준비
		Scanner in = new Scanner(System.in);
		
		//입력
		//번호,이름,태어난연도,성별
		//num,name,birthYear,gender
		//1,아이유,1898,여,
		
		System.out.println("번호를 입력하세요");
		// 실무형: nextInt() 대신 nextLine()으로 받아 숫자로 변환 (버퍼 꼬임 방지)
		int num = Integer.parseInt(in.nextLine()); 

		System.out.println("이름를 입력하세요");
		// 실무형: 띄어쓰기가 포함된 이름도 받을 수 있도록 nextLine() 사용
		String name = in.nextLine(); 

		System.out.println("태어난 연도를 입력하세요(예:2000)");
		int birthYear = Integer.parseInt(in.nextLine());

		System.out.println("성별을 입력하게요(남/여)");
		String gender = in.nextLine();


		//계산:process
		//나이=올해=태어난연도
		LocalDateTime today = LocalDateTime.now();
		int thisYear = today.getYear();
		int age = thisYear - birthYear;
		String adult="";
		if (age >= 20) {
			adult = "성인";
		} else {
			adult = "어린이";
		}
		// 실무형: 삼항 연산자를 사용하여 가독성 높임
		/* String adult = (age >= 19) ? "성인" : "어린이"; */

		
		//출력:output
		//번호(num):1
		//이름(name):아이유
		//나이(age):26살
		//성별(gender):남자/여자
		//성인(adult):어른/어린이
		System.out.println("번호:" + num);
		System.out.println(name + "님 안녕하세요");
		System.out.println("나이: " + age + "세");
		System.out.println("성별:" + gender);
		System.out.println("구분:" + adult);
		
		// 실무형: 사용이 끝난 스캐너는 닫아주는 것이 정석
		in.close(); 
	}

}
