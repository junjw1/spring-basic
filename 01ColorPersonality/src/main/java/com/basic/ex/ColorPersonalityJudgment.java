package com.basic.ex;

public class ColorPersonalityJudgment {

	public void judgePersonality(String color) {
		if (color.equals("빨강")) {
			System.out.println("외향적이고 적극적이며 자신감이 넘치는 사람");
		} else if (color.equals("주황")) {
			System.out.println("심성이 착하고 다른 사람과 어울리기 좋아하는 사람");
		} else if (color.equals("노랑")) {
			System.out.println("모험을 즐기며 늘 새로운 것을 찾는 사람");
		} else if (color.equals("초록")) {
			System.out.println("도덕적 민주적 견해를 가진 모범적인 사람");
		} else if (color.equals("파랑")) {
			System.out.println("고집이 세고 다소 보수적 신념을 가진 사람");
		} else if (color.equals("보라")) {
			System.out.println("개성이 강하고 감수성이 풍부한 사람");
		}
	}
}
