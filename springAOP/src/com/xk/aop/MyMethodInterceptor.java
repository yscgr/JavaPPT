package com.xk.aop;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {		
		System.out.println("方法调用之前...（环绕通知）");
		Object obj = arg0.proceed();
		System.out.println("方法调用之后...（环绕通知）");
		return obj;
	}
}
