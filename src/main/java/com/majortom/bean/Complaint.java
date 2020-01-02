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
@Table ( name ="complaint" )
public class Complaint  implements Serializable {

	private static final long serialVersionUID =  7923302722922832858L;

   	@Column(value = "complaint_id" )
	private Long complaintId;

   	@Column(value = "to_complaint_id" )
	private Long toComplaintId;

   	@Column(value = "bind_id" )
	private Long bindId;

   	@Column(value = "type" )
	private Integer type;

   	@Column(value = "content_id" )
	private Long contentId;

   	@Column(value = "dispose" )
	private Integer dispose;

}
