package cn.mikulove.akane.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import cn.mikulove.akane.dao.BlogTypeDao;
import cn.mikulove.akane.model.BlogType;
import cn.mikulove.akane.service.BlogTypeService;

@Service
public class BlogTypeServiceImpl implements BlogTypeService{
	
	@Resource
	private BlogTypeDao dao;

	@Override
	public BlogType createBlogType(BlogType blogType) {
		return dao.save(blogType);
	}

	@Override
	public BlogType findBlogType(Integer id) {
		BlogType result = new BlogType();
		BeanUtils.copyProperties(dao.findBlogTypeById(id),result);
		return result;
	}

}
