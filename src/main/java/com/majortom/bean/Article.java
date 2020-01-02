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
@Table ( name ="article" )
public class Article  implements Serializable {

	private static final long serialVersionUID =  8501451498992305157L;

   	@Column(value = "article_id" )
	private Long articleId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "title" )
	private String title;

   	@Column(value = "publish_time" )
	private Date publishTime;

   	@Column(value = "content_text" )
	private String contentText;

   	@Column(value = "comment_count" )
	private Long commentCount;

   	@Column(value = "liked_count" )
	private Long likedCount;

   	@Column(value = "forward_count" )
	private Long forwardCount;

}
