/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.student.entity.CrmStudentLecture;
import com.thinkgem.jeesite.modules.student.dao.CrmStudentLectureDao;

/**
 * 学员演讲管理Service
 * @author pengjinglei
 * @version 2017-11-09
 */
@Service
@Transactional(readOnly = true)
public class CrmStudentLectureService extends CrudService<CrmStudentLectureDao, CrmStudentLecture> {

	public CrmStudentLecture get(String id) {
		return super.get(id);
	}
	
	public List<CrmStudentLecture> findList(CrmStudentLecture crmStudentLecture) {
		return super.findList(crmStudentLecture);
	}
	
	public Page<CrmStudentLecture> findPage(Page<CrmStudentLecture> page, CrmStudentLecture crmStudentLecture) {
		return super.findPage(page, crmStudentLecture);
	}
	
	@Transactional(readOnly = false)
	public void save(CrmStudentLecture crmStudentLecture) {
		super.save(crmStudentLecture);
	}
	
	@Transactional(readOnly = false)
	public void delete(CrmStudentLecture crmStudentLecture) {
		super.delete(crmStudentLecture);
	}
	
}