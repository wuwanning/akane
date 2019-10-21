package cn.mikulove.akane.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_comment")
@Getter
@Setter
public class Comment implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
	private Integer id;
	
	@Column(name = "content",length = 200)
	private String content;

	public Comment(String content) {
		this.content = content;
	}
	public Comment() {
	}
	
}
