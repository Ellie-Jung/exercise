package com.myproject.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.myapp.domain.BoardRequest;
import com.myproject.myapp.service.RegService;

@Controller
@RequestMapping("board/reg")
public class RegController {
	
	@Autowired
	public RegService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String regForm() {
		
		  
		return "insert";
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String reg(BoardRequest boardRequest, Model model) {
		
		int result = service.reg(boardRequest);
		model.addAttribute("result",result);
		
		return "insert_ok";
	}
}
