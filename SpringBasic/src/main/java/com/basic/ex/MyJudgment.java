package com.basic.ex;

public class MyJudgment {

	private ColorPersonalityJudgment colorPersonalityJudgment;
	private String userName;
	private String userColor;

	public ColorPersonalityJudgment getColorPersonalityJudgment() {
		return colorPersonalityJudgment;
	}

	public void setColorPersonalityJudgment(ColorPersonalityJudgment colorPersonalityJudgment) {
		this.colorPersonalityJudgment = colorPersonalityJudgment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserColor() {
		return userColor;
	}

	public void setUserColor(String userColor) {
		this.userColor = userColor;
	}
	
	public void printUserInfo() {
		System.out.println("이름: " + userName);
		System.out.println("색깔: " + userColor);
	}
	
	public void judgeUserPersonality() {
		colorPersonalityJudgment.judgePersonality(userColor);
	}

}
