package com.basic.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment(); // env는 propertySource로 정보를 가지고 있다.
		MutablePropertySources propertySources = env.getPropertySources(); // 
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties")); // 외부설정 파일의 정보를 propertySources에 추가한다.
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx; // 컨테이너 설정 
		gCtx.load("applicationCTX.xml"); // 스프링설정파일 로드
		gCtx.refresh(); // 빈 객체 생성
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println( "admin ID : " + adminConnection.getAdminId() ); // 어디서 set 했을까?
		System.out.println( "admin PW : " + adminConnection.getAdminPw() );
		
		gCtx.close();
		ctx.close();

	}

}
