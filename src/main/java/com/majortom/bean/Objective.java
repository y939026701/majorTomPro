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
@Table ( name ="objective" )
public class Objective  implements Serializable {

	private static final long serialVersionUID =  7388683347473745861L;

   	@Column(value = "s_s_id" )
	private Long sSId;

   	@Column(value = "question_text" )
	private String questionText;

   	@Column(value = "choice_a" )
	private String choiceA;

   	@Column(value = "score_a" )
	private Long scoreA;

   	@Column(value = "choice_b" )
	private String choiceB;

   	@Column(value = "score_b" )
	private Long scoreB;

   	@Column(value = "choice_c" )
	private String choiceC;

   	@Column(value = "score_c" )
	private Long scoreC;

   	@Column(value = "choice_d" )
	private String choiceD;

   	@Column(value = "score_d" )
	private Long scoreD;

   	@Column(value = "type" )
	private Integer type;

}
