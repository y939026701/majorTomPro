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
@Table ( name ="history_activity" )
public class HistoryActivity  implements Serializable {

	private static final long serialVersionUID =  5194823451629546921L;

   	@Column(value = "h_a_id" )
	private Long hAId;

   	@Column(value = "a_id" )
	private Long aId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "h_a_time" )
	private Date hATime;

   	@Column(value = "type" )
	private Integer type;

}
