package com.xk.aop;
public class Service implements ServiceInterface,ServiceInterface2 {	
	@Override
	public void insertMySQLDb() {		
		System.out.println("执行业务逻辑，信息录入MySQL数据库中...");
	}
	@Override
	public void getDateFromOracle() {
		System.out.println("从Oracle数据库中读取信息...");
		int x = 13/0;
		
	}
}
