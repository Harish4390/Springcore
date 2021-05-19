package com.javahome.springcore;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.javahome.springcore")
public class AppConfig {

	@Bean("testConfig")
	public TestDemo appConfig() {
		return new TestDemo();
	}
}
