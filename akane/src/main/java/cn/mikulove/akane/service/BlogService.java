package cn.mikulove.akane.service;

import cn.mikulove.akane.model.Blog;

public interface BlogService {

	Blog createBlog(Blog blog);
	
	Blog findBlog(Integer id);

}
