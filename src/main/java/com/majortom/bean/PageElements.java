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
@Table ( name ="page_elements" )
public class PageElements  implements Serializable {

	private static final long serialVersionUID =  5124104413113438773L;

   	@Column(value = "p_e_id" )
	private Long pEId;

   	@Column(value = "name" )
	private String name;

}
