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
@Table ( name ="achievement" )
public class Achievement  implements Serializable {

	private static final long serialVersionUID =  3515112331851572844L;

	/**
	 * 成就表id
	 */
   	@Column(value = "achievement_id" )
	private Long achievementId;

	/**
	 * 用户id
	 */
   	@Column(value = "i_id" )
	private Long iId;

	/**
	 * 成就名称
	 */
   	@Column(value = "name" )
	private String name;

	/**
	 * 描述
	 */
   	@Column(value = "description" )
	private String description;

	/**
	 * 状态
	 */
   	@Column(value = "state" )
	private Integer state;

}
