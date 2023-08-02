package com.mailplug.homework.kwonbomiproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
	private int id;
	private String title;
	private String body;
	private String create_at;
	private String update_at;
	private int writerID;
	private int boardID;
	private int hit;
	
}
