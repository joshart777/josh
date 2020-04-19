package com.ftp.projectboard;

import java.util.List;

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
	
	@Override
	public List<Ftp_projectBoardVO> board_list() throws Exception {
		return dao.board_list();
	}
	
	@Override
	public String board_insert(Ftp_projectBoardVO vo) throws Exception {
		return dao.board_insert(vo);
	}
	
	@Override
	public int board_delete(Ftp_projectBoardVO vo, int i) throws Exception {
		return dao.board_delete(vo);
	}
	

}
