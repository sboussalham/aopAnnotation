package com.soufiane.aop_annotation;

import com.soufiane.aop_annotation.annotation.LogMethodName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopAnnotationApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("contextLoads executed!");
		testMethod();
	}

	@LogMethodName
	public void testMethod() {
		System.out.println("testMethod executed!");
	}

}
