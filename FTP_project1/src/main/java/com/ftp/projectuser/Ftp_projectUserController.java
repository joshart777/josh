package com.ftp.projectuser;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class Ftp_projectUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(Ftp_projectUserController.class);
	
	@Resource(name = "ftp_projectUserService")
	private Ftp_projectUserService service;
	
	@RequestMapping(value = "/user_list.do")
	public String user_list(ModelMap model, Ftp_projectUserVO vo) throws Exception {
				
		return "views/user/list";
		
	}
	
	@RequestMapping(value = "/join.do")
	public String join(ModelMap model, Ftp_projectUserVO vo) throws Exception {
				
		return "views/user/join";
		
	}
	
	@RequestMapping(value = "/register.do")
	public String register(ModelMap model, Ftp_projectUserVO vo) throws Exception {
		logger.info("post register");
		service.register(vo);
		return "index";
		
	}
	
	@RequestMapping(value = "/login_home.do")
	public String login_home() throws Exception{
		return "views/user/login_home";
	}
	
	
	@RequestMapping(value = "/login.do")
	public String login(Ftp_projectUserVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		Ftp_projectUserVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{		
		session.invalidate();		
		return "redirect:/";
	}
	
}
