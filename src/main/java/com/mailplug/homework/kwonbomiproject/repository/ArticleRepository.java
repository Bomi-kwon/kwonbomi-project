package com.mailplug.homework.kwonbomiproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mailplug.homework.kwonbomiproject.vo.Article;

@Mapper
public interface ArticleRepository {

	public List<Article> getArticles();

}
