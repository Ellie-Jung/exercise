package com.myproject.myapp.service;

@Service
public class BoardUpdateService {

	 private Dao dao;
	   
	   @Autowired
	   private SqlSessionTemplate template;
	   
	
	 public int editMember(
	         HttpServletRequest request,
	         Member member,
	         MemberEditRequest memberEditRequest) {

	      File newFile = null;
	      int resultCnt = 0;

	      try {
	         Member editMember = member;

	         if (memberEditRequest.getMemberPhoto() != null && !memberEditRequest.getMemberPhoto().isEmpty()) {
	        	 if(selectThatFile(member.getMemberIdx(),request) != null) {
	         		selectThatFile(member.getMemberIdx(),request).delete();
	         	}
	            newFile = saveProfileFile(request,memberEditRequest.getMemberPhoto());
	            editMember.setMemberProfile(newFile.getName());
	         }
	         editMember.setMemberName(memberEditRequest.getMemberName());
	         editMember.setMemberEmail(memberEditRequest.getMemberEmail());
	         editMember.setMemberNickname(memberEditRequest.getMemberNickname());
	         editMember.setMemberBirth(memberEditRequest.getBirth());

	         dao = template.getMapper(Dao.class);
	         resultCnt = dao.updateMember(member);

	      } catch (IllegalStateException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if(newFile != null & newFile.exists()) {
	            newFile.delete();
	            System.out.println("파일 삭제");
	         }
	      }
	      return resultCnt;
	   }
	
}
