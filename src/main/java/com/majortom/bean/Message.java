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
@Table ( name ="message" )
public class Message  implements Serializable {

	private static final long serialVersionUID =  7015563796416699900L;

   	@Column(value = "message_id" )
	private Long messageId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "title" )
	private String title;

   	@Column(value = "content_text" )
	private String contentText;

   	@Column(value = "type" )
	private Integer type;

}
