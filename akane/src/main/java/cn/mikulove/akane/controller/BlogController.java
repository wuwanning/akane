package cn.mikulove.akane.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mikulove.akane.model.Blog;
import cn.mikulove.akane.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@Resource
	private BlogService service;
	
	
	@GetMapping("/{id}")
	public Blog findBlog(@PathVariable("id")Integer id){
		return service.findBlog(id);
	}
	
	@PostMapping
	public Blog addBlog(@RequestBody Blog blog){
		return service.createBlog(blog);
	}
}
