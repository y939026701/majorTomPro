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
@Table ( name ="videos" )
public class Videos  implements Serializable {

	private static final long serialVersionUID =  847750814496887329L;

   	@Column(value = "v_id" )
	private Long vId;

   	@Column(value = "c_i_id" )
	private Long cIId;

   	@Column(value = "name" )
	private String name;

   	@Column(value = "intro" )
	private String intro;

}
