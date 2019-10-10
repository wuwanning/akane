package cn.mikulove.akane.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import cn.mikulove.akane.model.Blog;

@Repository
public interface BlogDao extends JpaRepository<Blog, Integer>, JpaSpecificationExecutor<Blog>{

}
