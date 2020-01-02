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
@Table ( name ="violations" )
public class Violations  implements Serializable {

	private static final long serialVersionUID =  5197452265205863905L;

   	@Column(value = "violations_id" )
	private Long violationsId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "concrete_content" )
	private String concreteContent;

   	@Column(value = "violations_time" )
	private Date violationsTime;

}
