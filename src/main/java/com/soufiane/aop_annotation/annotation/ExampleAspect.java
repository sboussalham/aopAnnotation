package com.soufiane.aop_annotation.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(LogMethodName)")
    public Object logMethodName(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = joinPoint.proceed();

        //System.out.println("Method name is : " + joinPoint.getSignature().getName());
        logger.info("Method name is {} ", joinPoint.getSignature().getName());
        int i = 0;
        for (Object o : joinPoint.getArgs()) {
            logger.info("Arg "+ o.getClass().getDeclaredFields()[i++].getName() + " with value {} ", o.toString());
        }
        return proceed;
    }
}
