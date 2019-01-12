package com.xk.service;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import com.xk.mapper.TuserloginMapper;
import com.xk.model.Tuserlogin;
import com.xk.model.TuserloginExample;
public class UserService {	
		private SqlSessionTemplate sqlSession;
		public void setSqlsession(SqlSessionTemplate sqlSession) {
			this.sqlSession = sqlSession;				
	}	
	//根据用户id查找用户
	public Tuserlogin findById(int id){	
		TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
		Tuserlogin user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	//查询所有用户信息
	public List<Tuserlogin> findAll(){
		TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
		TuserloginExample example = new TuserloginExample();
		List<Tuserlogin> users = userMapper.selectByExample(example);
		return users;
	}
	//根据用户id删除用户
	public boolean deleteById(int id) {
		boolean flag = false;
		try {
			TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
			userMapper.deleteByPrimaryKey(id);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return flag;
	}
	//删除全体用户信息
	public boolean deleteAll() {
		boolean flag = false;
		TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
		try {
			TuserloginExample example = new TuserloginExample();
			userMapper.deleteByExample(example);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return flag;
	}	
	//增加新用户信息
	public boolean addUser(Tuserlogin user) {
		boolean flag = false;
		TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
		try {
			userMapper.insert(user);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	//根据用户id修改用户信息
	public boolean modifyUser(Tuserlogin user) {
		boolean flag = false;
		TuserloginMapper userMapper = sqlSession.getMapper(TuserloginMapper.class);
		userMapper.updateByPrimaryKeySelective(user);
		return flag;
	}
}
