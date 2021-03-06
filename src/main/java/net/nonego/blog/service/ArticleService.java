package net.nonego.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.nonego.blog.dao.generator.mapper.ArticleMapper;
import net.nonego.blog.dao.generator.model.Article;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleMapper dao;
	
	public Article getArticleById(int id) {
		return dao.selectByPrimaryKey(id);
	}
}
