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
@Table ( name ="following" )
public class Following  implements Serializable {

	private static final long serialVersionUID =  6255610161086436541L;

   	@Column(value = "following_id" )
	private Long followingId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "time" )
	private Date time;

}
