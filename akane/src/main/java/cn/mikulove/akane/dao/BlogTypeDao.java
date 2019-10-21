package cn.mikulove.akane.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.mikulove.akane.model.BlogType;
import cn.mikulove.akane.vo.BlogTypeVO;

@Repository
public interface BlogTypeDao extends JpaRepository<BlogType, Integer>, JpaSpecificationExecutor<BlogType>{
	
	@Query(value = "select new cn.mikulove.akane.vo.BlogTypeVO(t.id,t.typeName,t.orderSort,(select count(1) from Blog b where b.typeId = t.id) as quantity) from BlogType t where t.id =:id")
	//@Query(value = "select t.*,1 as quantity from tb_blog_type t where t.id =:id", nativeQuery = true)
	BlogTypeVO findBlogTypeById(@Param("id") Integer id);

}
