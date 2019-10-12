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
@Table(name = "tb_sys_user")
@Getter
@Setter
@NoArgsConstructor
public class SysUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "username",unique=true, nullable=false,length=20)
	private String username;
	
	@Column(name = "password", nullable=false,length=40)
	private String password;
	
	@Column(name = "email",length=20)
	private String email;
	
	@Column(name = "phone",length=20)
	private String phone;
	
	
}
