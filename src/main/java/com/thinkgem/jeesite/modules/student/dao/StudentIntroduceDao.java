/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.student.entity.StudentIntroduce;

/**
 * 学生转介绍管理DAO接口
 * @author duzhiming
 * @version 2017-10-31
 */
@MyBatisDao
public interface StudentIntroduceDao extends CrudDao<StudentIntroduce> {
	
}