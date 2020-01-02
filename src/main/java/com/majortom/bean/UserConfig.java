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
@Table ( name ="user_config" )
public class UserConfig  implements Serializable {

	private static final long serialVersionUID =  5742852665761000922L;

   	@Column(value = "u_c_id" )
	private Long uCId;

   	@Column(value = "i_id" )
	private Long iId;

}
