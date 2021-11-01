package com.myproject.myapp.domain;

import java.time.LocalDateTime;

public class Board {


	private long idx;
	private String title;
    private String content;
    private String writer;
    private String password;
    private LocalDateTime insert_time;
    
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(LocalDateTime insert_time) {
		this.insert_time = insert_time;
	}
    
    
}
