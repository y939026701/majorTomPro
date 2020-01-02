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
@Table ( name ="movie_group_info" )
public class MovieGroupInfo  implements Serializable {

	private static final long serialVersionUID =  6102372783683404769L;

   	@Column(value = "m_info_id" )
	private Long mInfoId;

   	@Column(value = "c_i_id" )
	private Long cIId;

   	@Column(value = "name" )
	private String name;

   	@Column(value = "autograph" )
	private String autograph;

   	@Column(value = "synopsis" )
	private String synopsis;

   	@Column(value = "register_time" )
	private Date registerTime;

   	@Column(value = "active_city" )
	private String activeCity;

}
