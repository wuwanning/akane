package cn.mikulove.akane.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.mikulove.akane.dao.CommentDao;
import cn.mikulove.akane.model.Comment;
import cn.mikulove.akane.service.CommentService;

@CacheConfig(cacheNames = "commentService")
@Service
public class CommentServiceImpl implements CommentService{
	
	@Resource
	private CommentDao dao;

	@Override
	public Comment createComment(Comment comment) {
		return dao.save(comment);
	}

	@Override
	@Cacheable(value = "findComment")
	public Comment findComment(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Cacheable(value = "findAllComments")
	public List<Comment> findAllComments() {
		return dao.findAll();
	}

}
