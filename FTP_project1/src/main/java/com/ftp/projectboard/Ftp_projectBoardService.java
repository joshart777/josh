package com.ftp.projectboard;

import java.util.List;


import org.springframework.stereotype.Service;

import com.ftp.projectmain.Ftp_projectMainVO;

@Service("ftp_projectBoardController")

public interface Ftp_projectBoardService {
	
	int board_seq(Ftp_projectBoardVO vo) throws Exception;
	
	List<Ftp_projectBoardVO> board_list() throws Exception;

	String board_insert(Ftp_projectBoardVO vo) throws Exception;
	
	int board_delete(int i) throws Exception;
	
		
}
