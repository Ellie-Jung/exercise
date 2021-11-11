package com.myproject.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.myapp.service.BoardDeleteService;

@Controller
@RequestMapping("/board/delete")
public class BoardDeleteController {

	@Autowired
	BoardDeleteService service;
	
	
	

	@RequestMapping(method=RequestMethod.GET)
	public String deleteForm(HttpServletRequest request, Model model) {
		
		long idx= Integer.parseInt(request.getParameter("idx"));
		
		model.addAttribute("idx",idx);
		
		
		return "delete";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String delete(HttpServletRequest request, Model model,
						@RequestParam("idx") Long idx,
						@RequestParam("password") String password
						) {
		
	
		
		model.addAttribute("idx",request.getParameter("idx"));
		idx=(long) Integer.parseInt(request.getParameter("idx"));
		int result = service.boardDelete(idx,password);
		model.addAttribute("result",result);
		
		return "delete_ok";
	}
	
	
	
}
