package operator;

public class Test01 {
	public static void main(String[] args) {
		int a = 7 ;
		int b = 2 ;
		System.out.println( a / b ); //3:정수/정수->정수
		System.out.println( a / (b*1.0) ); //3.5:정수/정수->정수
		System.out.println( a / (double) b ); //강제(명시적)형변환 casting-explicit
		//System.out.println( 0 == 0.0 ); //자동(묵시적,암시적)형변환:implicit
		double b2 = 2.0;
		System.out.println( a / b2 ); //3.5:정수/실수->정수
		System.out.println( 7 % 2 ); //1
		System.out.println( 7 % 2.5 ); //2.0
		//---------------------------------------
		//비교연산자
		//==, !=, >, <, >=, <= : 문자열비교는 못함
		int age = 20;
		String adult = "";
		if( age >= 19 ) {
			adult = "성인";
		} else {
			adult = "미성년자";
		}
		System.out.println( adult );
		String gender = "";
		String sex = "여";
		if( sex.equals("남") )
			gender = "남자";
		else {
			if( sex.equals("여"))
			gender = "여자";
			else {
				gender = "몰라";
			}
		}	
		System.out.println( gender );
	}
} // 해당 괄호 찾기 단축키 ctrl+shift+p
