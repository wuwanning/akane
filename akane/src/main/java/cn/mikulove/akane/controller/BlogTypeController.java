package cn.mikulove.akane.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mikulove.akane.model.BlogType;
import cn.mikulove.akane.service.BlogTypeService;

@RestController
@RequestMapping("/blogtype")
public class BlogTypeController {

	@Resource
	private BlogTypeService service;
	
	
	@GetMapping("/{id}")
	public BlogType findBlogType(@PathVariable("id")Integer id){
		return service.findBlogType(id);
	}
	
	@PostMapping
	public BlogType addBlogType(@RequestBody BlogType blogType){
		return service.createBlogType(blogType);
	}
}
