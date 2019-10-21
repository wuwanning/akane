package cn.mikulove.akane.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_blog_type")
@Getter
@Setter
@NoArgsConstructor
public class BlogType implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "type_name",unique=true, nullable=false,length=20)
	private String typeName;
	
	@Column(name = "order_sort")
	private Integer orderSort;
	
	@Transient
	private Long quantity;

}
