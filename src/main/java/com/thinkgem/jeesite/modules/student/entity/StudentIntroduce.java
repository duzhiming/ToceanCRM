/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;
import com.thinkgem.jeesite.modules.sys.entity.User;

/**
 * 学员转介绍Entity
 * @author duzhiming
 * @version 2017-11-06
 */
public class StudentIntroduce extends DataEntity<StudentIntroduce> {
	
	private static final long serialVersionUID = 1L;
	private Date introdate;		// 介绍日期
	private User employee;		// 介绍人
	private StudentInfo student;		// 学生
	
	public StudentIntroduce() {
		super();
	}

	public StudentIntroduce(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getIntrodate() {
		return introdate;
	}

	public void setIntrodate(Date introdate) {
		this.introdate = introdate;
	}
	
	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}
	
	public StudentInfo getStudent() {
		return student;
	}

	public void setStudent(StudentInfo student) {
		this.student = student;
	}
	
}