package com.majortom.bean;

import com.xuetang9.commons.jdbc.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2020-01-02 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="role" )
public class Role  implements Serializable {

	private static final long serialVersionUID =  3355175654679902349L;

	/**
	 * id
	 */
   	@Column(value = "role_id" )
	private Long roleId;

	/**
	 * 名称
	 */
   	@Column(value = "name" )
	private String name;

	/**
	 * 显示名
	 */
   	@Column(value = "display_name" )
	private String displayName;

	/**
	 * 创建时间
	 */
   	@Column(value = "create_data" )
	private Date createData;

	/**
	 * 描述
	 */
   	@Column(value = "description" )
	private String description;

}
