package com.majortom.bean;

import com.xuetang9.commons.jdbc.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2020-01-02 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="menu" )
public class Menu  implements Serializable {

	private static final long serialVersionUID =  8416684771397578514L;

   	@Column(value = "menu_id" )
	private Long menuId;

   	@Column(value = "name" )
	private String name;

   	@Column(value = "menu_url" )
	private String menuUrl;

   	@Column(value = "parent_id" )
	private Long parentId;

}
