/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.student.entity.StudentPraise;

/**
 * 学生表扬DAO接口
 * @author yuangmingyu
 * @version 2017-11-06
 */
@MyBatisDao
public interface StudentPraiseDao extends CrudDao<StudentPraise> {
	
}