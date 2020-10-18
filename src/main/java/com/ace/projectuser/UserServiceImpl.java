package com.ace.projectuser;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;




@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Resource(name = "UserDAO")
	private UserDAO dao;
	 
	@Override
	public int test(UserVO vo) throws Exception {
		return dao.test(vo);
	}
	
	@Override
	public String register(UserVO vo) throws Exception {
		return dao.register(vo);
	}
	
	@Override
	public UserVO login(UserVO vo) throws Exception {
	return dao.login(vo);
	}
}
