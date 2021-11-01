package com.myproject.myapp.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;

@Service
public class BoardDeleteService {

	 // 크루의 Dao
	   private Dao dao;

	   @Autowired
	   private SqlSessionTemplate template;

	
	 // 크루 삭제
	   public int deleteCrew(int crewIdx, HttpServletRequest request) {
	      int resultCnt = 0;
	      dao = template.getMapper(Dao.class);
	      selectThatFile(request, crewIdx).delete();
	      resultCnt = dao.deleteCrew(crewIdx);
	      return resultCnt;
	   }
	
}
