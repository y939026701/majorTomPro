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
@Table ( name ="folder_privilege" )
public class FolderPrivilege  implements Serializable {

	private static final long serialVersionUID =  3582634288876830114L;

   	@Column(value = "folder_id" )
	private Long folderId;

   	@Column(value = "privilege_id" )
	private Long privilegeId;

}
