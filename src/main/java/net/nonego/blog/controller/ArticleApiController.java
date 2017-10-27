package net.nonego.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.nonego.blog.dao.generator.model.Article;
import net.nonego.blog.result.ErrorEnum;
import net.nonego.blog.result.JsonUtil;
import net.nonego.blog.result.Result;
import net.nonego.blog.service.ArticleService;

@Controller
@RequestMapping("/article/api")
public class ArticleApiController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getArtileById(@PathVariable("id") int id) {
		Article article = articleService.getArticleById(id);
		Result<Article> result = new Result<>(ErrorEnum.OK, article);
		String resultStr = JsonUtil.format(result);
		return resultStr;
	}
}
