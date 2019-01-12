package com.xk.aop;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
public class MyAfterReturningAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, 
									Object[] args, Object target) 
											   throws Throwable {
		System.out.println("关闭连接资源...");
	}
}
