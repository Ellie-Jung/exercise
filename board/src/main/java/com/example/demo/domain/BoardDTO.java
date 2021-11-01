package com.example.demo.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {

	private long idx;
	private String title;
    private String content;
    private String writer;
    private String password;
    private long view_cnt;
    private LocalDateTime insert_time;
    
    
}
