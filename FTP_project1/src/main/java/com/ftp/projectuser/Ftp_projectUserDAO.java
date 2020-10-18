package com.ftp.projectuser;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("ftp_projectUserDAO")
public class Ftp_projectUserDAO {
	
	@Autowired
	private SqlMapClient sql;


	//@SuppressWarnings("unchecked")
	public int test(Ftp_projectUserVO vo) throws SQLException {	
		
		return (Integer)sql.queryForObject("ftp_projectUserDAO.test",vo);
	}
	
	public String register(Ftp_projectUserVO vo) throws SQLException {			
		return (String)sql.insert("register",vo);
	}
	
	public Ftp_projectUserVO login(Ftp_projectUserVO vo) throws Exception {		
		return (Ftp_projectUserVO)sql.queryForObject("login", vo);
	}

}
