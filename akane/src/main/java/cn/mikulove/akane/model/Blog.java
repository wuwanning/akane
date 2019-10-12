package cn.mikulove.akane.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_blog")
@Getter
@Setter
@NoArgsConstructor
public class Blog implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title",nullable=false,length = 150)
	private String title;

	@Column(name = "summary",length = 200)
	private String summary;
	
	@Column(name="content", columnDefinition="text")
	private String content;
	
	
	@Column(name="create_date",columnDefinition="datetime")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	
	@Column(name = "click_hit")
	private Integer clickHit;
	
	
	//private Integer userId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id",insertable = false,updatable = false)
	private BlogType blogType;
	
	@Column(name="type_id")//,columnDefinition = "int(11)" 
	private Integer typeId;
}
