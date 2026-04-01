package condition;

import java.util.Scanner;

public class TestSungjuk2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//입력
		//이름, 국어, 영어, 수학
		//name, kor, eng, mat
		System.out.println("이름을 작성하시오");
		String name = in.nextLine();
		System.out.println("국어성적을 입력하시오");
		int kor = in.nextInt();
		System.out.println("영어성적을 입력하시오");
		int eng = in.nextInt();
		System.out.println("mat");
		int mat = in.nextInt();
		
		//출력
		//등급 90~100 : A
		//등급 80~89.99 : B
		//등급 70~79.99 : C
		//등급 60~69.99 : D
		//등급 0~59.99 : F
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		
		// 3. 등급 판별
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		
		//이름, 총점, 평균, 등급
		//name, tot, avg, grade
		System.out.println("이름:"+name);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("등급:"+grade);
		
		in.close();
		
	}
}