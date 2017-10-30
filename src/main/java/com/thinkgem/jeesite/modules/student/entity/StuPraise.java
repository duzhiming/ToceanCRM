/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 表扬管理Entity
 * @author duzhiming
 * @version 2017-10-30
 */
public class StuPraise extends DataEntity<StuPraise> {
	
	private static final long serialVersionUID = 1L;
	private Date praisedate;		// 表扬时间
	private String praiseway;		// 表扬的方式
	private String reason;		// 原因
	private String score;		// 分数
	private StudentInfo studentId;		// 学生编号
	private String booker;		// 登记人
	private Date bookdate;		// 登记时间
	private String confirmer;		// 确认人
	private Date confirmdate;		// 确认时间
	private String approve;		// 批准
	private String status;		// 状态
	private String opinion;		// 建议
	
	public StuPraise() {
		super();
	}

	public StuPraise(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPraisedate() {
		return praisedate;
	}

	public void setPraisedate(Date praisedate) {
		this.praisedate = praisedate;
	}
	
	@Length(min=0, max=20, message="表扬的方式长度必须介于 0 和 20 之间")
	public String getPraiseway() {
		return praiseway;
	}

	public void setPraiseway(String praiseway) {
		this.praiseway = praiseway;
	}
	
	@Length(min=0, max=255, message="原因长度必须介于 0 和 255 之间")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	public StudentInfo getStudent() {
		return studentId;
	}

	public void setStudent(StudentInfo student) {
		this.studentId = student;
	}
	
	@Length(min=0, max=10, message="登记人长度必须介于 0 和 10 之间")
	public String getBooker() {
		return booker;
	}

	public void setBooker(String booker) {
		this.booker = booker;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBookdate() {
		return bookdate;
	}

	public void setBookdate(Date bookdate) {
		this.bookdate = bookdate;
	}
	
	@Length(min=0, max=10, message="确认人长度必须介于 0 和 10 之间")
	public String getConfirmer() {
		return confirmer;
	}

	public void setConfirmer(String confirmer) {
		this.confirmer = confirmer;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getConfirmdate() {
		return confirmdate;
	}

	public void setConfirmdate(Date confirmdate) {
		this.confirmdate = confirmdate;
	}
	
	@Length(min=0, max=10, message="批准长度必须介于 0 和 10 之间")
	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}
	
	@Length(min=0, max=11, message="状态长度必须介于 0 和 11 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
}