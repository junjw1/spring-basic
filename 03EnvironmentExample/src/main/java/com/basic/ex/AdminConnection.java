package com.basic.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean{
	
	private Environment env;
	private String adminId;
	private String adminPw;
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	@Override
	public void setEnvironment(Environment environment) { // 빈이 생성 전 최초로 이 메서드가 호출된다. 시스템에서 environment 객체를 매개변수로 넘긴다.
		System.out.println("setEnvironment()");
		setEnv(environment); // 시스템이 넘겨준 environment 객체를 env 필드에 설정한다.
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destory()");
	}
	
}
