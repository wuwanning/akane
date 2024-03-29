package cn.mikulove.akane;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.assertj.core.util.Arrays;
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

	}

	public static String codeAddOne(Integer code, int len){
	   String strHao = code.toString();
	   while (strHao.length() < len) {
         strHao = "0" + strHao;
       }
	   return strHao;
	}
	
	public static void main(String[] args) {
		List<Object> al = Arrays.asList(new String[]{"aa","bb","cc","dd","ee","ff"});
		int page = al.size()/3;
	    
		for(int i=0;i<=page;i++){
			if(i==page){
				List<Object> data = al.subList(i*3,al.size());
			}else{
				List<Object> data = al.subList(i*3, 3*(i+1));
				System.out.println(data.get(0));
				System.out.println(data.get(1));
				System.out.println(data.get(2));
			}
			System.out.println("---------------");
		}
		
		
       //1.创建线程池
        ExecutorService pool=Executors.newFixedThreadPool(5);

        List<Future<Integer>> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future=pool.submit(new Callable<Integer>(){
                @Override
                public Integer call() throws Exception {
                    int sum=0;
                    for(int i=0;i<=100;i++){
                        sum+=i;
                    }
                    return sum;
                }

            });
            list.add(future);
        }
        pool.shutdown();
        for(Future<Integer> future:list){
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        /* */
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
