package com.mailplug.homework.kwonbomiproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mailplug.homework.kwonbomiproject.repository.ArticleRepository;
import com.mailplug.homework.kwonbomiproject.vo.Article;

@Service
public class ArticleService {
	private ArticleRepository articleRepository;

	@Autowired
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}
	
}
