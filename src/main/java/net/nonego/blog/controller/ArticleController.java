package net.nonego.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.nonego.blog.dao.generator.model.Article;
import net.nonego.blog.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public String getArtileById(@PathVariable("id") int id, Model model) {
		Article article = articleService.getArticleById(id);
		model.addAttribute(article);
		return "test/article";
	}
}
