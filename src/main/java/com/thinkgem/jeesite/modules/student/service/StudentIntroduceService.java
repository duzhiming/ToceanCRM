/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.student.entity.StudentIntroduce;
import com.thinkgem.jeesite.modules.student.dao.StudentIntroduceDao;

/**
 * 学生转介绍管理Service
 * @author duzhiming
 * @version 2017-10-31
 */
@Service
@Transactional(readOnly = true)
public class StudentIntroduceService extends CrudService<StudentIntroduceDao, StudentIntroduce> {

	public StudentIntroduce get(String id) {
		return super.get(id);
	}
	
	public List<StudentIntroduce> findList(StudentIntroduce studentIntroduce) {
		return super.findList(studentIntroduce);
	}
	
	public Page<StudentIntroduce> findPage(Page<StudentIntroduce> page, StudentIntroduce studentIntroduce) {
		return super.findPage(page, studentIntroduce);
	}
	
	@Transactional(readOnly = false)
	public void save(StudentIntroduce studentIntroduce) {
		super.save(studentIntroduce);
	}
	
	@Transactional(readOnly = false)
	public void delete(StudentIntroduce studentIntroduce) {
		super.delete(studentIntroduce);
	}
	
}