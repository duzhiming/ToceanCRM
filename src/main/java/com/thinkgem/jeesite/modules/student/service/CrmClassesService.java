/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.student.entity.CrmClasses;
import com.thinkgem.jeesite.modules.student.dao.CrmClassesDao;

/**
 * 课室信息Service
 * @author duzhiming
 * @version 2017-11-02
 */
@Service
@Transactional(readOnly = true)
public class CrmClassesService extends CrudService<CrmClassesDao, CrmClasses> {

	public CrmClasses get(String id) {
		return super.get(id);
	}
	
	public List<CrmClasses> findList(CrmClasses crmClasses) {
		return super.findList(crmClasses);
	}
	
	public Page<CrmClasses> findPage(Page<CrmClasses> page, CrmClasses crmClasses) {
		return super.findPage(page, crmClasses);
	}
	
	@Transactional(readOnly = false)
	public void save(CrmClasses crmClasses) {
		super.save(crmClasses);
	}
	
	@Transactional(readOnly = false)
	public void delete(CrmClasses crmClasses) {
		super.delete(crmClasses);
	}
	
}