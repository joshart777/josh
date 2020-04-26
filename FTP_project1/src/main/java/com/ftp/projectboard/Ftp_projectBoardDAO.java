package com.ftp.projectboard;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import com.ibatis.sqlmap.client.SqlMapClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("ftp_projectBoardDAO")
public class Ftp_projectBoardDAO {
	
	@Autowired
	private SqlMapClient sql;
	
	
	public int board_seq(Ftp_projectBoardVO vo) throws SQLException {					
		return (Integer)sql.queryForObject("ftp_projectBoardDAO.board_seq",vo);
	}
			
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> board_list(Criteria cri) throws SQLException {
	    return (List<Map<String,Object>>)sql.queryForList("ftp_projectBoardDAO.board_list", cri);
	}	
	
	public String board_insert(Ftp_projectBoardVO vo) throws SQLException {					
		return (String)sql.insert("ftp_projectBoardDAO.board_insert",vo);
	}
	
	public Integer board_delete(int i) throws SQLException {					
		return (Integer)sql.delete("ftp_projectBoardDAO.board_delete", i);
	}
	
}
