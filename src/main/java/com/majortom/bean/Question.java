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
@Table ( name ="question" )
public class Question  implements Serializable {

	private static final long serialVersionUID =  4187614288389832528L;

   	@Column(value = "question_id" )
	private Long questionId;

   	@Column(value = "question_text" )
	private String questionText;

   	@Column(value = "content_text" )
	private String contentText;

   	@Column(value = "type" )
	private Integer type;

}
