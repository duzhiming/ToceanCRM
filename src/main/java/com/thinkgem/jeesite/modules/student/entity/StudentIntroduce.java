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
	private String student;		// 学员
	private Date introdate;		// 介绍日期
	private String empname;		// 介绍人编号
	private StudentInfo students;		// 学员编号
	
	public StudentIntroduce() {
		super();
	}

	public StudentIntroduce(String id){
		super(id);
	}

	@Length(min=0, max=10, message="学员长度必须介于 0 和 10 之间")
	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getIntrodate() {
		return introdate;
	}

	public void setIntrodate(Date introdate) {
		this.introdate = introdate;
	}
	
	@Length(min=0, max=20, message="介绍人编号长度必须介于 0 和 20 之间")
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public StudentInfo getStudents() {
		return students;
	}

	public void setStudents(StudentInfo student) {
		this.students = student;
	}
	
}