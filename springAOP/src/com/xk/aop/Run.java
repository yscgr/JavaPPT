package com.xk.aop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Run {	
	@Test
	public void test() {		
		ApplicationContext ac = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		ServiceInterface s = (ServiceInterface) ac.getBean("proxyFactoryBean");
		s.insertMySQLDb();
		((ServiceInterface2)s).getDateFromOracle();
	}
}
