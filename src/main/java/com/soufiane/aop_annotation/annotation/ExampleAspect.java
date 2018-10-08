package com.soufiane.aop_annotation.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {
    @Around("@annotation(LogMethodName)")
    public Object logMethodName(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = joinPoint.proceed();

        System.out.println("Method signature is : " + joinPoint.getSignature());
        return proceed;
    }
}
