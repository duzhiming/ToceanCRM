/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.student.entity.StuPraise;
import com.thinkgem.jeesite.modules.student.dao.StuPraiseDao;

/**
 * 表扬管理Service
 * @author duzhiming
 * @version 2017-10-30
 */
@Service
@Transactional(readOnly = true)
public class StuPraiseService extends CrudService<StuPraiseDao, StuPraise> {

	public StuPraise get(String id) {
		return super.get(id);
	}
	
	public List<StuPraise> findList(StuPraise stuPraise) {
		return super.findList(stuPraise);
	}
	
	public Page<StuPraise> findPage(Page<StuPraise> page, StuPraise stuPraise) {
		return super.findPage(page, stuPraise);
	}
	
	@Transactional(readOnly = false)
	public void save(StuPraise stuPraise) {
		super.save(stuPraise);
	}
	
	@Transactional(readOnly = false)
	public void delete(StuPraise stuPraise) {
		super.delete(stuPraise);
	}
	
}