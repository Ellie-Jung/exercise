package com.myproject.myapp.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;
import com.myproject.myapp.domain.Board;

@Service
public class BoardDeleteService {

	private Dao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	public int boardDelete(Long idx, String password) {
		
		int resultCnt=0;
		dao= template.getMapper(Dao.class);
		
		Board board = dao.selectBoardDetail(idx);
		if(board.getPassword().equals(password)) {
			resultCnt=dao.deleteBoard(idx);
		}
		
		
		return resultCnt;
		
	}
	
	
}
