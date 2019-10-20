package cn.mikulove.akane.service;

import java.util.List;

import cn.mikulove.akane.model.Comment;

public interface CommentService {

	Comment createComment(Comment comment);
	
	Comment findComment(Integer id);

	List<Comment> findAllComments();
}
