package com.javahome.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		System.out.println("Hellow World!!!!!!!!");

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestDemo td = (TestDemo) ac.getBean("testConfig");
		td.testDemo();
	}
}
