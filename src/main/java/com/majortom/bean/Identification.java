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
@Table ( name ="identification" )
public class Identification  implements Serializable {

	private static final long serialVersionUID =  2735392111656771281L;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "user_id" )
	private Long userId;

   	@Column(value = "c_i_id" )
	private Long cIId;

   	@Column(value = "nick_name" )
	private String nickName;

   	@Column(value = "password" )
	private String password;

   	@Column(value = "level" )
	private Long level;

   	@Column(value = "autograph" )
	private String autograph;

   	@Column(value = "register_time" )
	private Date registerTime;

   	@Column(value = "y_money" )
	private Long yMoney;

}
