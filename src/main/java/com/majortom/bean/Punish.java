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
@Table ( name ="punish" )
public class Punish  implements Serializable {

	private static final long serialVersionUID =  8109339183102174621L;

   	@Column(value = "punish_id" )
	private Long punishId;

   	@Column(value = "violations_id" )
	private Long violationsId;

   	@Column(value = "time" )
	private Date time;

   	@Column(value = "time_length" )
	private Long timeLength;

   	@Column(value = "type" )
	private Integer type;

}
