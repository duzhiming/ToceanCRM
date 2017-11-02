/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.student.entity.StudentInfo;

/**
 * 学生管理DAO接口
 * @author duzhiming
 * @version 2017-11-02
 */
@MyBatisDao
public interface StudentInfoDao extends CrudDao<StudentInfo> {
	
}