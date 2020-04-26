package com.ftp.projectboard;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



@Service("ftp_projectBoardService")
public class Ftp_projectBoardServiceImpl implements Ftp_projectBoardService{
	
	@Resource(name = "ftp_projectBoardDAO")
	private Ftp_projectBoardDAO dao;
	 
	@Override
	public int board_seq(Ftp_projectBoardVO vo) throws Exception {
		return dao.board_seq(vo);
	}
		
	public List<Map<String, Object>> board_list(Criteria cri) throws Exception {
		    return dao.board_list(cri);
	}		
	
	@Override
	public String board_insert(Ftp_projectBoardVO vo) throws Exception {
		return dao.board_insert(vo);
	}
	
	@Override
	public int board_delete(int i) throws Exception {
		return dao.board_delete(i);
	}
	

}
