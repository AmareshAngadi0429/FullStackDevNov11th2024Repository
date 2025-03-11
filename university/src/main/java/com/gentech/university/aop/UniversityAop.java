package com.gentech.university.aop;
import com.gentech.university.entity.University;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class UniversityAop {

    @Before(value = "execution(* com.gentech.university.controller.UniversityController.*(..))")
    public void beforeAdviceMethod(JoinPoint joinPoint)
    {
        System.out.println(" execution of the controller Api"+joinPoint.getSignature()+" has started at "+new Date());
    }

}
