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
@Table ( name ="group_history_activity" )
public class GroupHistoryActivity  implements Serializable {

	private static final long serialVersionUID =  1287965904669057419L;

   	@Column(value = "h_a_id" )
	private Long hAId;

   	@Column(value = "m_id" )
	private Long mId;

   	@Column(value = "a_id" )
	private Long aId;

}
