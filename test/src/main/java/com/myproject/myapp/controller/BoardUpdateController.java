package com.myproject.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myproject.myapp.domain.Board;
import com.myproject.myapp.domain.BoardRequest;
import com.myproject.myapp.service.BoardDetailService;
import com.myproject.myapp.service.BoardUpdateService;

@Controller
@RequestMapping("board/update")
public class BoardUpdateController {
	
	@Autowired
	private BoardUpdateService service;
	@Autowired
	BoardDetailService detailService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String updateForm(HttpServletRequest request, Model model) {
	
	long idx= Integer.parseInt(request.getParameter("idx"));
	Board board= detailService.getDetailList(idx);
	model.addAttribute("board",board);
		
		
		
		return "update";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String update(HttpServletRequest request,BoardRequest boardRequest, Model model) {
		
		long idx= Integer.parseInt(request.getParameter("idx"));
		Board board= detailService.getDetailList(idx);
		int result=service.editBoard(boardRequest, board);
		model.addAttribute("result", result);
		return "update_ok";
	}
	
	   
}
