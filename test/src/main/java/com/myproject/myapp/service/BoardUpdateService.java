package com.myproject.myapp.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;
import com.myproject.myapp.domain.Board;
import com.myproject.myapp.domain.BoardRequest;

@Service
public class BoardUpdateService {

	private Dao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	public int editBoard(BoardRequest boardRequest, Board board) {
		
		int resultCnt=0;
		Board editBoard= board;
		
		editBoard.setTitle(boardRequest.getTitle());
		editBoard.setContent(boardRequest.getContent());
		editBoard.setWriter(boardRequest.getWriter());
		editBoard.setPassword(boardRequest.getPassword());
		
		dao = template.getMapper(Dao.class);
		resultCnt=dao.updateBoard(editBoard);
		
		return resultCnt;
		
		
	}
}
