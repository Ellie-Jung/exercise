package com.myproject.myapp.domain;

import java.time.LocalDateTime;

public class Comment {

	private int comIdx;
	private String comContent;
	private String comWriter;
	private LocalDateTime comDate;
	private int idx;
	
	public int getComIdx() {
		return comIdx;
	}
	public void setComIdx(int comIdx) {
		this.comIdx = comIdx;
	}
	public String getComContent() {
		return comContent;
	}
	public void setComContent(String comContent) {
		this.comContent = comContent;
	}
	public String getComWriter() {
		return comWriter;
	}
	public void setComWriter(String comWriter) {
		this.comWriter = comWriter;
	}
	public LocalDateTime getComDate() {
		return comDate;
	}
	public void setComDate(LocalDateTime comDate) {
		this.comDate = comDate;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
	
}
