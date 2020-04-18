package com.ftp.projectuser;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Ftp_projectUserController {
	
	@Resource(name = "ftp_projectUserService")
	private Ftp_projectUserService service;
	
	@RequestMapping(value = "/user_list.do")
	public String user_list(ModelMap model, Ftp_projectUserVO vo) throws Exception {
				
		return "views/user/list";
		
	}
	
	@RequestMapping(value = "/join.do")
	public String join(ModelMap model, Ftp_projectUserVO vo) throws Exception {
				
		return "views/user/list";
		
	}
	
	
	
}
