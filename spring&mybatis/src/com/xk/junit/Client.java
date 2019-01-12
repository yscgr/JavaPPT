package com.xk.junit;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xk.model.Tuserlogin;
import com.xk.service.UserService;
public class Client {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext
			("applicationContext.xml");
	UserService userService = (UserService) ctx.getBean("userMapper");
	//根据用户id查找用户
	@Test
	public void testFindById() {		
		Tuserlogin user = userService.findById(2);
	    System.out.println(user.getUsername()+" "+user.getEmail());
	}
	//查询所有用户信息
	@Test
	public void testGetAllUsers() {
		List<Tuserlogin> users = userService.findAll();
		Iterator<Tuserlogin> it = users.iterator();
		while(it.hasNext()) {
			Tuserlogin user = it.next();
			System.out.println(user.getUsername()+" "+user.getEmail());
		}		
	}
	//根据用户id删除用户
	@Test
	public void testDeleteById() {
		Tuserlogin user = userService.findById(18);		
	}
	//删除全体用户信息
	@Test
	public void testDeleteAll() {
		userService.deleteAll();	
	}
	//增加新用户信息
	@Test
	public void testAddUser() {
		Tuserlogin user = (Tuserlogin) ctx.getBean("user");
		user.setUsername("newuser1");
		user.setPassword("123");
		user.setGrade(1);
		user.setEmail("newuser1@126.com");
		userService.addUser(user);		
	}
	//修改用户信息
	@Test
	public void testModifyUser() {
		Tuserlogin user = (Tuserlogin) ctx.getBean("user");
		user.setId(1);
		user.setUsername("admin_123");
		user.setPassword("888888");
		user.setGrade(1);
		user.setEmail("admin_123@126.com");
		userService.modifyUser(user);		
	}
}
