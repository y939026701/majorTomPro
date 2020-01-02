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
@Table ( name ="user" )
public class User  implements Serializable {

	private static final long serialVersionUID =  3885275449516477081L;

	/**
	 * 用户id
	 */
   	@Column(value = "user_id" )
	private Long userId;

	/**
	 * 用户名称
	 */
   	@Column(value = "user_name" )
	private String userName;

	/**
	 * 用户性别
	 */
   	@Column(value = "gender" )
	private Integer gender;

	/**
	 * 年龄
	 */
   	@Column(value = "age" )
	private Long age;

	/**
	 * 生日
	 */
   	@Column(value = "birthday" )
	private Date birthday;

	/**
	 * 电话
	 */
   	@Column(value = "tel" )
	private String tel;

	/**
	 * 邮箱
	 */
   	@Column(value = "email" )
	private String email;

	/**
	 * 地址
	 */
   	@Column(value = "address" )
	private String address;

	/**
	 * 身份证号
	 */
   	@Column(value = "id_num" )
	private String idNum;

}
