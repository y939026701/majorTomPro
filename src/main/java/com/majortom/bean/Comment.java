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
@Table ( name ="comment" )
public class Comment  implements Serializable {

	private static final long serialVersionUID =  6572658164917688186L;

   	@Column(value = "comment_id" )
	private Long commentId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "publish_id" )
	private Long publishId;

   	@Column(value = "content_text" )
	private String contentText;

   	@Column(value = "publish_time" )
	private Date publishTime;

   	@Column(value = "liked_count" )
	private Long likedCount;

   	@Column(value = "type" )
	private Integer type;

}
