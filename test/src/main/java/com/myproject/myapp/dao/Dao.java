package com.myproject.myapp.dao;

import java.util.List;

import com.myproject.myapp.domain.Board;
import com.myproject.myapp.domain.Comment;


public interface Dao {

	//게시판
	public int insertBoard(Board board);
	public Board selectBoardDetail(Long idx);
	public int updateBoard(Board board);
	public int deleteBoard(Long idx);
	public List<Board> selectBoardList();
	
	//댓글
	public int insertComment(Comment comment);
	public List<Comment> selectCommentList();
	public int updateComment(Comment comment);
	public int deleteComemnt(int comIdx);
	
	
}
