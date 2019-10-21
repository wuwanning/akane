package cn.mikulove.akane.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlogTypeVO  implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String typeName;
	
	private Integer orderSort;
	
	//类型所含数量
	private Long quantity;

}
