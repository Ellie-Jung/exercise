package com.myproject.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.myapp.domain.Board;
import com.myproject.myapp.service.BoardDetailService;

@Controller
public class BoardDetailController {

	@Autowired
	BoardDetailService service;
	
	@RequestMapping("/board/detail")
	public String boarDetail(Model model,@RequestParam long idx) {
		
		Board board=null;
		
		board = service.getDetailList(idx);
		
		model.addAttribute("board",board);
		
		return "detail";
	}
	
	
}
