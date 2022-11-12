package com.waa.waalab4.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Aspect
@Configuration
public class MyAspect {
    @Autowired
    LoggerRepository loggerRepository;

    @Around("execution(* com.waa.waalab4.users.controller.*.*(..))")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        long statTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - statTime;
        System.out.println(timeTaken);

        Logger logger = new Logger();

        logger.setOperation(joinPoint.getSignature().getName());
        logger.setDate(new Date());
        logger.setTime(timeTaken);
        logger.setPrincipal("Yemane");
        loggerRepository.save(logger);

    }
}
