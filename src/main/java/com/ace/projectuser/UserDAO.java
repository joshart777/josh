package com.ace.projectuser;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("UserDAO")
public class UserDAO {
	
	@Autowired
	private SqlMapClient sql;


	//@SuppressWarnings("unchecked")
	public int test(UserVO vo) throws SQLException {	
		
		return (Integer)sql.queryForObject("UserDAO.test",vo);
	}
	
	public String register(UserVO vo) throws SQLException {			
		return (String)sql.insert("register",vo);
	}
	
	public UserVO login(UserVO vo) throws Exception {		
		return (UserVO)sql.queryForObject("login", vo);
	}

}
