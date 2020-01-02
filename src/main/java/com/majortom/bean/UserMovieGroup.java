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
@Table ( name ="user_movie_group" )
public class UserMovieGroup  implements Serializable {

	private static final long serialVersionUID =  4633794033615565487L;

   	@Column(value = "i_id" )
	private Long iId;

   	@Column(value = "m_id" )
	private Long mId;

   	@Column(value = "type" )
	private Integer type;

}
