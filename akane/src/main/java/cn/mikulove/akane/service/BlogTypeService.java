package cn.mikulove.akane.service;

import cn.mikulove.akane.model.BlogType;

public interface BlogTypeService {

	BlogType createBlogType(BlogType blogType);
	
	BlogType findBlogType(Integer id);

}
