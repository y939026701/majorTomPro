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
@Table ( name ="history_log" )
public class HistoryLog  implements Serializable {

	private static final long serialVersionUID =  1820854127864542169L;

   	@Column(value = "h_i_id" )
	private Long hIId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "log_time" )
	private Date logTime;

   	@Column(value = "log_ip" )
	private Long logIp;

}
