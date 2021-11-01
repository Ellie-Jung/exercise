package com.myproject.myapp.controller;

@Controller
public class BoardDeleteController {

	
	@RequestMapping("delete")
	public String CrewDelete(HttpServletRequest request, Model model) {
		
		model.addAttribute("idx",request.getParameter("crewIdx"));
		int crewIdx=Integer.parseInt(request.getParameter("crewIdx"));
		int result = service.deleteCrew(crewIdx,request);
		model.addAttribute("result", result);
		return "admin/admin_crewDelete";
	}
}
