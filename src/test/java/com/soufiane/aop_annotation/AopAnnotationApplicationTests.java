package com.soufiane.aop_annotation;

import com.soufiane.aop_annotation.annotation.LogMethodName;
import com.soufiane.aop_annotation.service.Service;
import com.soufiane.postRequest.CallingRestApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopAnnotationApplicationTests {

	@Autowired
	private Service service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void loggerMethodNameTest() {
		System.out.println("loggerMethodNameTest executed!");
		service.testMethod("Dada");
	}

	@Test
	public void makePostCallTest() {
		String response = CallingRestApi.call();
		System.out.println(response);
	}
}
