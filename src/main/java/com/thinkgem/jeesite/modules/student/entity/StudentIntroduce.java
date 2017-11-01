/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 学生转介绍管理Entity
 * @author duzhiming
 * @version 2017-10-31
 */
public class StudentIntroduce extends DataEntity<StudentIntroduce> {
	
	private static final long serialVersionUID = 1L;
	private String stuname;		// 学员
	private Date introdate;		// 介绍日期
	private String empname;		// 介绍人
	private StudentInfo student;		// 学员编号
	
	public StudentIntroduce() {
		super();
	}

	public StudentIntroduce(String id){
		super(id);
	}

	@Length(min=0, max=10, message="学员长度必须介于 0 和 10 之间")
	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getIntrodate() {
		return introdate;
	}

	public void setIntrodate(Date introdate) {
		this.introdate = introdate;
	}
	
	@Length(min=0, max=20, message="介绍人长度必须介于 0 和 20 之间")
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public StudentInfo getStudent() {
		return student;
	}

	public void setStudent(StudentInfo student) {
		this.student = student;
	}
	
}