package operator;

import java.util.Scanner;

public class TestRSP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 1. 컴퓨터 랜덤 선택 (1:가위, 2:바위, 3:보)
		int ran = (int) (Math.random() * 3) + 1;
		String com = "";
		
		if (ran == 1) { com = "가위"; }
		if (ran == 2) { com = "바위"; }
		if (ran == 3) { com = "보"; }

		// 2. 사용자 입력받기
		System.out.println("가위, 바위, 보 중 하나 입력");
		String user = in.next();

		// 3. 결과 비교 (글자 비교는 반드시 .equals() 사용)
		System.out.println("컴퓨터: " + com + " / 당신: " + user);

		if (user.equals(com)) {
			System.out.println("비겼습니다!");
		} 
		else if (user.equals("가위")) {
			if (com.equals("보")) { System.out.println("당신이 이겼습니다"); }
			if (com.equals("바위")) { System.out.println("당신이 졌습니다"); }
		} 
		else if (user.equals("바위")) {
			if (com.equals("가위")) { System.out.println("당신이 이겼습니다"); }
			if (com.equals("보")) { System.out.println("당신이 졌습니다"); }
		} 
		else if (user.equals("보")) {
			if (com.equals("바위")) { System.out.println("당신이 이겼습니다"); }
			if (com.equals("가위")) { System.out.println("당신이 졌습니다"); }
		} 
		else {
			System.out.println("잘못 입력했습니다. (가위/바위/보 중 선택)");
		}

		System.out.println("게임 끝");
	}
}
