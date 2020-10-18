package com.ace.projectboard;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ace.projectmain.MainVO;

@Service("BoardController")

public interface BoardService {
	
	int board_seq(BoardVO vo) throws Exception;
		
	List<Map<String, Object>> board_list(Criteria cri) throws Exception;
	
	int board_count() throws SQLException;

	String board_insert(BoardVO vo) throws Exception;
	
	int board_delete(int i) throws Exception;	
	
		
}
