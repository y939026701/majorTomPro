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
@Table ( name ="menu_privilege" )
public class MenuPrivilege  implements Serializable {

	private static final long serialVersionUID =  4961569940570202931L;

   	@Column(value = "menu_id" )
	private Long menuId;

   	@Column(value = "privilege_id" )
	private Long privilegeId;

}
