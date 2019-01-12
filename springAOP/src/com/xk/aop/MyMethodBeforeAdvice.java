package com.xk.aop;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	private static Logger logger = Logger.getLogger(Test.class);
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("在前置通知中，已经写入日志信息");
		logger.debug("This is debug message."); 
	}
}
