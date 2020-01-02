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
@Table ( name ="collection" )
public class Collection  implements Serializable {

	private static final long serialVersionUID =  5105962246847435959L;

   	@Column(value = "collection_id" )
	private Long collectionId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "folder_id" )
	private Long folderId;

   	@Column(value = "time" )
	private Date time;

   	@Column(value = "bind_id" )
	private Long bindId;

}
