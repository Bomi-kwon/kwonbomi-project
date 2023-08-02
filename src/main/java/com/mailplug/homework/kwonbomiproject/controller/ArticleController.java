package com.mailplug.homework.kwonbomiproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mailplug.homework.kwonbomiproject.service.ArticleService;
import com.mailplug.homework.kwonbomiproject.vo.Article;

@Controller
public class ArticleController {
	private ArticleService articleService;
	
	@Autowired
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}


	@RequestMapping("/article/list")
	public String showList(Model model) {
		
		List<Article> articles = articleService.getArticles();
		model.addAttribute("articles",articles);
		
		return "article/list";
	}
}
