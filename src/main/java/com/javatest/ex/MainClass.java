package com.javatest.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 컨테이너 생성
		
		ctx.load("classpath:applicationCTX.xml"); // 컨테이너 설정
		ctx.refresh();
		
		
		ctx.close(); // 컨테이너 종료
	}

}
