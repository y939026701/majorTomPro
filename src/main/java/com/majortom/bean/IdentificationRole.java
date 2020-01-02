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
@Table ( name ="identification_role" )
public class IdentificationRole  implements Serializable {

	private static final long serialVersionUID =  5788065119975152944L;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "role_id" )
	private Long roleId;

}
