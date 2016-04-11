package trironkk.personal;

import java.util.Arrays;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class ExampleAspect {
    @Pointcut("@annotation(trironkk.personal.ExampleAnnotation)")
    public void exampleMethod() {}

    @Before("exampleMethod()")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint);
    }
 
    @Around("exampleMethod()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint);
        System.out.println("Arguments : " + Arrays.toString(joinPoint.getArgs()));
        
        joinPoint.proceed();

        System.out.println(joinPoint);
    }

    @After("exampleMethod()")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint);
    }
}
