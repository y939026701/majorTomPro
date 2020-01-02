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
@Table ( name ="images" )
public class Images  implements Serializable {

	private static final long serialVersionUID =  8017243709697570090L;

   	@Column(value = "c_i_id" )
	private Long cIId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "img_url" )
	private String imgUrl;

}
