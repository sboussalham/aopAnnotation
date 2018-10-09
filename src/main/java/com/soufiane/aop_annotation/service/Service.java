package com.soufiane.aop_annotation.service;

import com.soufiane.aop_annotation.annotation.LogMethodName;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @LogMethodName
    public void testMethod(String s) {
        System.out.println("testMethod executed!");
    }
}
