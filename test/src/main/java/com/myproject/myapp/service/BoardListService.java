package com.myproject.myapp.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.myapp.dao.Dao;
import com.myproject.myapp.domain.Board;

@Service
public class BoardListService {

	private Dao dao;
	
	@Autowired
	private SqlSessionTemplate template;

	public List<Board> getBoardList(){
		dao=template.getMapper(Dao.class);
		return dao.selectBoardList();
	}

	
}
