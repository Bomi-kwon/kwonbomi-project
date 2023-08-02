package com.mailplug.homework.kwonbomiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {
	// 첫 연결 테스트
	
	@RequestMapping("")
	public String showList() {
		
		
		return "";
	}
}
