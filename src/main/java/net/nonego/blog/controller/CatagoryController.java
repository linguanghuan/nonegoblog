package net.nonego.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.nonego.blog.dao.generator.mapper.CategoryMapper;
import net.nonego.blog.dao.generator.model.Category;


@Controller
@RequestMapping("/catagory/")
public class CatagoryController {
	@Autowired
	CategoryMapper catagoryMapper;
	
	@RequestMapping("/add")
	@ResponseBody
	public String add() {
		Category record = new Category();
		record.setName("test");
		catagoryMapper.insert(record );
		return "success";
	}
}
