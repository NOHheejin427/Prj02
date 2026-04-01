package operator;

import java.time.LocalDateTime;
import java.util.Date;
//자동 import 단축키(import 정리) : ctrl+shift+o
//해당라인 import 단축키(jso에서 사용_ctrl+shift+o이 단축키가 안 먹음) : 커서+ctrl+shift+m

public class TestMealTime {
	public static void main(String[] args) {
		//객체를 호출하는 방법 2가지
		//Date today = Date.valueOf("2000-09-09");	객체이름.함수()
		//new 객체()
		LocalDateTime  now = LocalDateTime.now();
		//Date today = new Date(); //import java.util.Date
		//Date today = new.valueOf("2000-09-09"); //import java.sql.Data
		int hour = now.getHour();
		String mealTime = "";
		System.out.println(hour);
		if( 6 <= hour && hour < 11 )
			mealTime = "아침";
		else
			if( 11 <= hour && hour < 15 )
				mealTime = "점심";
			else
				if ( 15 <= hour && hour < 21 )
					mealTime = "저녁";
				else 
					mealTime = "자라";
		System.out.println(mealTime);
	}
}
