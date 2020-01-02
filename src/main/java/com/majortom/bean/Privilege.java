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
@Table ( name ="privilege" )
public class Privilege  implements Serializable {

	private static final long serialVersionUID =  3927494618522044236L;

   	@Column(value = "p_id" )
	private Long pId;

   	@Column(value = "type" )
	private String type;

   	@Column(value = "description" )
	private String description;

}
