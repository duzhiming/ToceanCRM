/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 课室信息Entity
 * @author duzhiming
 * @version 2017-11-01
 */
public class CrmClasses extends DataEntity<CrmClasses> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 班级名
	private Date opendate;		// opendate
	private Date closedate;		// closedate
	private String monitor;		// 班长
	private String studentamount;		// studentamount
	private Long typeId;		// type_id
	private Long classroomId;		// classroom_id
	private Long teacherId;		// 班主任编号
	private Long pmId;		// 项目经理编号
	private Long subareaId;		// subarea_id
	private String qq;		// qq
	
	public CrmClasses() {
		super();
	}

	public CrmClasses(String id){
		super(id);
	}

	@Length(min=0, max=20, message="班级名长度必须介于 0 和 20 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getClosedate() {
		return closedate;
	}

	public void setClosedate(Date closedate) {
		this.closedate = closedate;
	}
	
	@Length(min=0, max=20, message="班长长度必须介于 0 和 20 之间")
	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	
	@Length(min=1, max=11, message="studentamount长度必须介于 1 和 11 之间")
	public String getStudentamount() {
		return studentamount;
	}

	public void setStudentamount(String studentamount) {
		this.studentamount = studentamount;
	}
	
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	
	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	
	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	
	public Long getPmId() {
		return pmId;
	}

	public void setPmId(Long pmId) {
		this.pmId = pmId;
	}
	
	public Long getSubareaId() {
		return subareaId;
	}

	public void setSubareaId(Long subareaId) {
		this.subareaId = subareaId;
	}
	
	@Length(min=0, max=10, message="qq长度必须介于 0 和 10 之间")
	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	
}