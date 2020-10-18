package com.ace.projectmain;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;




@Service("MainService")
public class MainServiceImpl implements MainService{
	
	@Resource(name = "MainDAO")
	private MainDAO dao;
	 
	@Override
	public int test(MainVO vo) throws Exception {
		return dao.test(vo);
	}

}
