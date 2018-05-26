package com.basic.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation = "applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyJudgment myJudgment = ctx.getBean("myJudgment", MyJudgment.class);
		
		myJudgment.printUserInfo();
		myJudgment.judgeUserPersonality();
		
	}

}
