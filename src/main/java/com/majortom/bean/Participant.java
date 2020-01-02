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
@Table ( name ="participant" )
public class Participant  implements Serializable {

	private static final long serialVersionUID =  4104703099359188755L;

   	@Column(value = "participan_id" )
	private Long participanId;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "a_id" )
	private Long aId;

   	@Column(value = "a_f_id" )
	private Long aFId;

   	@Column(value = "type" )
	private Integer type;

}
