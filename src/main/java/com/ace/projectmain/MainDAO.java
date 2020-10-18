package com.ace.projectmain;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("MainDAO")
public class MainDAO {
	
	@Autowired
	private SqlMapClient sql;


	//@SuppressWarnings("unchecked")
	public int test(MainVO vo) throws SQLException {	
		
		return (Integer)sql.queryForObject("MainDAO.test",vo);
	}

	public List<MainVO> List_Ftpboard(MainVO vo) throws SQLException {
		return sql.queryForList("MainDAO.List_AceBoard", vo);
	}

}
