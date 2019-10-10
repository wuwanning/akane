package cn.mikulove.akane.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mikulove.akane.dao.BlogDao;
import cn.mikulove.akane.model.Blog;
import cn.mikulove.akane.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{
	
	@Resource
	private BlogDao dao;

	@Override
	public Blog createBlog(Blog blog) {
		return dao.save(blog);
	}

	@Override
	public Blog findBlog(Integer id) {
		return dao.findById(id).get();
	}

}
