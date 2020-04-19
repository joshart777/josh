package com.ftp.projectboard;



import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


 
 

@Controller
public class Ftp_projectBoardController {
	
	
	
	@Resource(name = "ftp_projectBoardService")
	private Ftp_projectBoardService service;
	
	//게시글 리스트
	@RequestMapping(value = "/board_list.do")
	public String ftpproject1_tab01(ModelMap model, Ftp_projectBoardVO vo) throws Exception {
	
		int board_seq =service.board_seq(vo);
	
		List<Ftp_projectBoardVO> boardList = service.board_list(); 
		
		
		model.addAttribute("board_seq", board_seq );
		model.addAttribute("boardList", boardList );
		return "views/board/board_list";
		
	}
	
	//게시글 작성 화면
	@RequestMapping(value = "/board_write.do")
	public String board_write(ModelMap model, Ftp_projectBoardVO vo) throws Exception {
		
		return "views/board/board_write";
	}
	
	
	//게시글 작성 처리
	@RequestMapping(value = "/board_insert.do")
	public String board_insert(ModelMap model, Ftp_projectBoardVO vo) throws Exception {
		
		service.board_insert(vo);		
		System.out.println(vo);		
		return "redirect:/board_list.do";		
	}
	
	@RequestMapping(value = "/board_delete.do")
	public String board_delete(ModelMap model, Ftp_projectBoardVO vo) throws Exception{
		String[] arrIdx =  vo.getBoard_seq().toString().split(",");		
		System.out.println("test = " + Arrays.toString(arrIdx));
		
		for (int i = 0; i < arrIdx.length; i++) {
			service.board_delete(Integer.parseInt(arrIdx[i]));			
		}
		
		return "redirect:/board_list.do";
	}
	
}
