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
@Table ( name ="application_form" )
public class ApplicationForm  implements Serializable {

	private static final long serialVersionUID =  5642218496211029575L;

   	@Column(value = "a_f_id" )
	private Long aFId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

}
