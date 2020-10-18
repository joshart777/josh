package com.ace.projectmain;

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
public class MainController {
	
	@Resource(name = "MainService")
	private MainService service;
	
	@RequestMapping(value = "/main.do")
	public String ftp_project_main(ModelMap model, MainVO vo) throws Exception {
	
		
		return "views/main";
		
	}
	
	@RequestMapping(value = "/pop/pop2.do")
	public String pop2(ModelMap model, MainVO vo) throws Exception {			
		return "views/pop/pop2";
		
	}
	
		
	@RequestMapping(value = "/")
	public String ftp_project_main() throws Exception {
	
		return "views/main";
		
	}
	
	
}
