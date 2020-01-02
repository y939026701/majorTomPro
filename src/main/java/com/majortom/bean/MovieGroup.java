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
@Table ( name ="movie_group" )
public class MovieGroup  implements Serializable {

	private static final long serialVersionUID =  8740032103624225894L;

   	@Column(value = "m_g_id" )
	private Long mGId;

   	@Column(value = "m_info_id" )
	private Long mInfoId;

   	@Column(value = "level" )
	private Long level;

   	@Column(value = "y_money" )
	private Long yMoney;

}
