/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.student.entity.CrmUser;
import com.thinkgem.jeesite.modules.student.dao.CrmUserDao;

/**
 * 用户信息Service
 * @author duzhiming
 * @version 2017-11-01
 */
@Service
@Transactional(readOnly = true)
public class CrmUserService extends CrudService<CrmUserDao, CrmUser> {

	public CrmUser get(String id) {
		return super.get(id);
	}
	
	public List<CrmUser> findList(CrmUser crmUser) {
		return super.findList(crmUser);
	}
	
	public Page<CrmUser> findPage(Page<CrmUser> page, CrmUser crmUser) {
		return super.findPage(page, crmUser);
	}
	
	@Transactional(readOnly = false)
	public void save(CrmUser crmUser) {
		super.save(crmUser);
	}
	
	@Transactional(readOnly = false)
	public void delete(CrmUser crmUser) {
		super.delete(crmUser);
	}
	
}