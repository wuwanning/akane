package cn.mikulove.akane;

import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.mikulove.akane.model.Comment;
import cn.mikulove.akane.service.CommentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AkaneApplicationTests {
	
	@Resource
	private CommentService service;

	@Test
	public void contextLoads() {
		
		for (int i = 0; i < 100; i++) {
			service.createComment(new Comment(getRandomString(5)));
		}
		
	}
	 public static String getRandomString(int length){
	     String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	       int number=random.nextInt(62);
	       sb.append(str.charAt(number));
	     }
	     return sb.toString();
	 }
}
