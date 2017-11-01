/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 用户信息Entity
 * @author duzhiming
 * @version 2017-11-01
 */
public class CrmUser extends DataEntity<CrmUser> {
	
	private static final long serialVersionUID = 1L;
	private String userid;		// 用户编号
	private String name;		// 用户真实名
	private String loginid;		// 用户名
	private String password;		// 密码
	private String admin;		// 是否管理人
	private String usertype;		// 用户类型
	private Long deptid;		// 部门编号
	
	public CrmUser() {
		super();
	}

	public CrmUser(String id){
		super(id);
	}

	@Length(min=1, max=64, message="用户编号长度必须介于 1 和 64 之间")
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Length(min=0, max=100, message="用户真实名长度必须介于 0 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=20, message="用户名长度必须介于 0 和 20 之间")
	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	
	@Length(min=0, max=20, message="密码长度必须介于 0 和 20 之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Length(min=1, max=1, message="是否管理人长度必须介于 1 和 1 之间")
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
	@Length(min=1, max=4, message="用户类型长度必须介于 1 和 4 之间")
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public Long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	
}