package com.myproject.myapp.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;
import com.myproject.myapp.domain.Board;

@Service
public class BoardDetailService {

	Dao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	
	public Board getDetailList(long idx){
		
		dao = template.getMapper(Dao.class);
		return dao.selectBoardDetail(idx);
			
		
	}
	
}
