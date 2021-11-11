package com.myproject.myapp.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;

@Service
public class BoardDeleteService {

	private Dao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	public int boardDelete(Long idx) {
		
		
		dao= template.getMapper(Dao.class);
		return dao.deleteBoard(idx);
		
	}
	
	
}
