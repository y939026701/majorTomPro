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
@Table ( name ="blacklist" )
public class Blacklist  implements Serializable {

	private static final long serialVersionUID =  8725206969424289518L;

   	@Column(value = "blacklist_id" )
	private Long blacklistId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "id" )
	private Long id;

   	@Column(value = "time" )
	private Date time;

}
