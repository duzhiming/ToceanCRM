/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 学员演讲管理Entity
 * @author pengjinglei
 * @version 2017-11-09
 */
public class CrmStudentLecture extends DataEntity<CrmStudentLecture> {
	
	private static final long serialVersionUID = 1L;
	private CrmClasses classes;		// 班级
	private StudentInfo studentes;		// 学员
	private String createrid;		// 登记人
	private String content;		// 演讲内容
	private Date date;		// 演讲日期
	private String evaluation;		// 评价
	private String score;		// 评分
	private String advice;		// 建议
	private String pmId;		// 项目经理
	
	public CrmStudentLecture() {
		super();
	}

	public CrmStudentLecture(String id){
		super(id);
	}

	public CrmClasses getClasses() {
		return classes;
	}

	public void setClasses(CrmClasses classes) {
		this.classes = classes;
	}
	public StudentInfo getStudentes() {
		return studentes;
	}

	public void setStudentes(StudentInfo studentes) {
		this.studentes = studentes;
	}

	@Length(min=0, max=100, message="登记人长度必须介于 0 和 100 之间")
	public String getCreaterid() {
		return createrid;
	}

	public void setCreaterid(String createrid) {
		this.createrid = createrid;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	
	@Length(min=1, max=11, message="评分长度必须介于 1 和 11 之间")
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	@Length(min=0, max=100, message="项目经理长度必须介于 0 和 100 之间")
	public String getPmId() {
		return pmId;
	}

	public void setPmId(String pmId) {
		this.pmId = pmId;
	}
	
}