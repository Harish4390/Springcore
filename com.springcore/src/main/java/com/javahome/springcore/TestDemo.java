package com.javahome.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.javahome.springcore.test.Test;

public class TestDemo {
	
	@Autowired
	@Qualifier("testImpl")
	private Test t;
	
	public void testDemo() {
		t.test();
	}

}
