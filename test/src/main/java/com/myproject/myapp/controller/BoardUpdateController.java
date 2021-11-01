package com.myproject.myapp.controller;

public class BoardUpdateController {
	 @Autowired
	   private MypageService service;

	   @RequestMapping(value = "/member/mypage", method = RequestMethod.GET)
	   public String getMypage(HttpServletRequest request, Model model) {
	      MemberDto memberVo = (MemberDto) request.getSession().getAttribute("memberVo");
	      Member member = service.getMemberSelectByIdx(memberVo.getMemberIdx());
	      model.addAttribute("member", member);
	      return "member/mypage/mypage";
	   }

	   @RequestMapping(value = "/member/mypage", method = RequestMethod.POST)
	   public String postMypage(HttpServletRequest request, MemberEditRequest memberEditRequest, Model model) {
	      MemberDto memberVo = (MemberDto) request.getSession().getAttribute("memberVo");
	      System.out.println(memberVo);
	      Member member = service.getMemberSelectByIdx(memberVo.getMemberIdx());
	      int result = service.editMember(request, member, memberEditRequest);
	      model.addAttribute("result", result);
	      return "member/mypage/update";
	   }

	   @RequestMapping(value="/member/mypage/pwchange", method=RequestMethod.GET)
	   public String getPwChangePage(HttpServletRequest request, Model model) {
	      MemberDto memberVo = (MemberDto) request.getSession().getAttribute("memberVo");
	      Member member = service.getMemberSelectByIdx(memberVo.getMemberIdx());
	      model.addAttribute("member", member);
	      return "member/mypage/mypagePwChange";
	   }

	   @RequestMapping(value="/member/mypage/pwchange", method=RequestMethod.POST)
	   public String getPwChange(HttpServletRequest request, Model model) {
	      MemberDto memberVo = (MemberDto) request.getSession().getAttribute("memberVo");
	      Member member = service.getMemberSelectByIdx(memberVo.getMemberIdx());

	      String oldPw=request.getParameter("pw");
	      String newPw=request.getParameter("newpw");
	      String newPw2=request.getParameter("newpw2");
	      int result = service.editPw(oldPw,newPw,newPw2,member);

	      model.addAttribute("result", result);
	      return "member/mypage/changePw";
	   }
}
