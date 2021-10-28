package com.selenium.aspect.support.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ClickAspect {

    @Pointcut("@annotation(com.selenium.aspect.support.annotation.Click) && execution(* *(..))")
    public void clickAnn() {}

    @Around("clickAnn()")
    public void clickOnAction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Clicking on a button");
        joinPoint.proceed();
    }
}
