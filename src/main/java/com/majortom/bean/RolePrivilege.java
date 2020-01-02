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
@Table ( name ="role_privilege" )
public class RolePrivilege  implements Serializable {

	private static final long serialVersionUID =  8357301819929642730L;

   	@Column(value = "role_id" )
	private Long roleId;

   	@Column(value = "privilege_id" )
	private Long privilegeId;

}
