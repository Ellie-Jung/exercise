package com.myproject.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myproject.myapp.domain.Board;
import com.myproject.myapp.service.BoardListService;

@Controller
public class BoardListController {

	@Autowired
	BoardListService service;
	
	@RequestMapping("/board")
	public String getBoardList(HttpServletRequest request, Model model) {
		List<Board> list =null;
		
		list=service.getBoardList();
		
		model.addAttribute("boardList", list);
		
		return "list";
	}
	
}
