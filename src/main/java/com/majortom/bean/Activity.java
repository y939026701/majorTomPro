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
@Table ( name ="activity" )
public class Activity  implements Serializable {

	private static final long serialVersionUID =  6434935341851056920L;

	/**
	 * 活动id
	 */
   	@Column(value = "a_id" )
	private Long aId;

	/**
	 * 观影团id
	 */
   	@Column(value = "m_id" )
	private Long mId;

	/**
	 * 影片id
	 */
   	@Column(value = "v_id" )
	private Long vId;

	/**
	 * 参与者id
	 */
   	@Column(value = "participan_id" )
	private Long participanId;

	/**
	 * 标题
	 */
   	@Column(value = "title" )
	private String title;

	/**
	 * 活动开始时间
	 */
   	@Column(value = "strart_time" )
	private Date strartTime;

	/**
	 * 报名开始时间
	 */
   	@Column(value = "strart_apply_time" )
	private Date strartApplyTime;

	/**
	 * 报名结束时间
	 */
   	@Column(value = "end_apply_time" )
	private Date endApplyTime;

	/**
	 * 活动结束时间
	 */
   	@Column(value = "end_time" )
	private Date endTime;

	/**
	 * 电影开始时间
	 */
   	@Column(value = "movie_strart_time" )
	private Date movieStrartTime;

	/**
	 * 影片时长
	 */
   	@Column(value = "moive_length" )
	private Long moiveLength;

	/**
	 * 电影结束时间
	 */
   	@Column(value = "move_end_time" )
	private Date moveEndTime;

	/**
	 * 所在城市
	 */
   	@Column(value = "city" )
	private String city;

	/**
	 * 影院地址
	 */
   	@Column(value = "cinema_address" )
	private String cinemaAddress;

	/**
	 * 名额
	 */
   	@Column(value = "places" )
	private Long places;

}
