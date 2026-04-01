package condition;

import java.util.Scanner;

public class TestSungjuk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//입력
		//이름, 국어, 영어, 수학
		//name, kor, eng, mat
		System.out.println("입력:이름,국어,영어,수학");
		String line = in.nextLine();
		String [] li = line.split(",");
		String name = li[0];
		int kor = Integer.parseInt(li[1]); //int<-Integer.parseInt(문자열)
		int eng = Integer.parseInt(li[2]);
		int mat = Integer.parseInt(li[3]);
		
		
		//계산
		//총점:국어+영어+수학
		//평균:총점/3.0
		
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