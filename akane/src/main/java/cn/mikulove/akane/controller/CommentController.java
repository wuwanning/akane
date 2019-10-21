package cn.mikulove.akane.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mikulove.akane.model.Comment;
import cn.mikulove.akane.page.JpaPageHelper;
import cn.mikulove.akane.page.PageInfo;
import cn.mikulove.akane.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {

	@Resource
	private CommentService service;
	
	
	@GetMapping("/{id}")
	public Comment findComment(@PathVariable("id")Integer id){
		return service.findComment(id);
	}
	
	@PostMapping
	public Comment addComment(@RequestBody Comment comment){
		return service.createComment(comment);
	}
	
	@PostMapping("/page")
	public List<PageInfo> findCommentPage(){
		List<Comment> dataList = service.findAllComments();
		JpaPageHelper jpaPageHelper = new JpaPageHelper();
		List<PageInfo> pageIfos = jpaPageHelper.SetStartPage(dataList, 2, 20);
		return pageIfos;
	}
}
