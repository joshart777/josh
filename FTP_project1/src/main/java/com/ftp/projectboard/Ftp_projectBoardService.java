package com.ftp.projectboard;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ftp.projectmain.Ftp_projectMainVO;

@Service("ftp_projectBoardController")

public interface Ftp_projectBoardService {
	
	int board_seq(Ftp_projectBoardVO vo) throws Exception;
		
	List<Map<String, Object>> board_list(Criteria cri) throws Exception;
	
	int board_count() throws SQLException;

	String board_insert(Ftp_projectBoardVO vo) throws Exception;
	
	int board_delete(int i) throws Exception;	
	
		
}
