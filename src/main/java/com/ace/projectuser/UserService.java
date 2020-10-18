package com.ace.projectuser;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("Ftp_projectUserController")

public interface UserService {
	
	int test(UserVO vo) throws Exception;	
	
	String register(UserVO vo) throws Exception;
	
	UserVO login(UserVO vo) throws Exception;
	
}
