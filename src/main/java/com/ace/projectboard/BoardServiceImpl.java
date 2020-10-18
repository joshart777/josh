package com.ace.projectboard;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name = "BoardDAO")
	private BoardDAO dao;
	 
	@Override
	public int board_seq(BoardVO vo) throws Exception {
		return dao.board_seq(vo);
	}
		
	public List<Map<String, Object>> board_list(Criteria cri) throws Exception {
		    return dao.board_list(cri);
	}
	
	@Override
	public int board_count() throws SQLException {
	    return dao.board_count();
	}	
	
	@Override
	public String board_insert(BoardVO vo) throws Exception {
		return dao.board_insert(vo);
	}
	
	@Override
	public int board_delete(int i) throws Exception {
		return dao.board_delete(i);
	}
	

}
