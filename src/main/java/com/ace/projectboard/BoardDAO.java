package com.ace.projectboard;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.activation.CommandMap;

import com.ibatis.sqlmap.client.SqlMapClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("BoardDAO")
public class BoardDAO {
	
	@Autowired
	private SqlMapClient sql;
	
	
	public int board_seq(BoardVO vo) throws SQLException {					
		return (Integer)sql.queryForObject("BoardDAO.board_seq",vo);
	}
			
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> board_list(Criteria cri) throws SQLException {
	    return (List<Map<String,Object>>)sql.queryForList("BoardDAO.board_list", cri);
	}
	
	 int board_count() throws SQLException{
		    return (Integer)sql.queryForObject("BoardDAO.countBoard");
	}		
	
	public String board_insert(BoardVO vo) throws SQLException {					
		return (String)sql.insert("BoardDAO.board_insert",vo);
	}
	
	public Integer board_delete(int i) throws SQLException {					
		return (Integer)sql.delete("BoardDAO.board_delete", i);
	}
	
}
