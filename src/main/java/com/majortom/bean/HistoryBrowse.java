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
@Table ( name ="history_browse" )
public class HistoryBrowse  implements Serializable {

	private static final long serialVersionUID =  2819980748793855847L;

   	@Column(value = "h_b_id" )
	private Long hBId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "browse_time" )
	private Date browseTime;

}
