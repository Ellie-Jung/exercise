package com.myproject.myapp.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;
import com.myproject.myapp.domain.Board;
import com.myproject.myapp.domain.BoardRequest;

@Service
public class RegService {

	private Dao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	
	public int reg(BoardRequest boardRequest) {
		
		int resultCnt = 0;
		
		Board board = new Board();
		
		board.setTitle(boardRequest.getTitle());
		board.setContent(boardRequest.getContent());
		board.setWriter(boardRequest.getWriter());
		board.setPassword(boardRequest.getPassword());
		board.setPassword(boardRequest.getPassword());
		
		dao=template.getMapper(Dao.class);
		
		resultCnt=dao.insertBoard(board);
		
		return resultCnt;
		
	}
}
