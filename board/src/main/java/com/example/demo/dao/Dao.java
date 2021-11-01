package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.BoardDTO;


@Mapper
public interface Dao {

	public int insertBoard(BoardDTO boardDto);
	public BoardDTO selectBoardDetail(Long idx);
	public int updateBoard(BoardDTO boardDto);
	public int deleteBoard(Long idx);
	public List<BoardDTO> selectBoardList();
	public int selectBoardTotalCount();

	
}
