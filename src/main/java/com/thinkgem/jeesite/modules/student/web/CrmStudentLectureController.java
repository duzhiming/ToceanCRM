/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.student.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.student.entity.CrmStudentLecture;
import com.thinkgem.jeesite.modules.student.service.CrmStudentLectureService;

/**
 * 学员演讲管理Controller
 * @author pengjinglei
 * @version 2017-11-09
 */
@Controller
@RequestMapping(value = "${adminPath}/student/crmStudentLecture")
public class CrmStudentLectureController extends BaseController {

	@Autowired
	private CrmStudentLectureService crmStudentLectureService;
	
	@ModelAttribute
	public CrmStudentLecture get(@RequestParam(required=false) String id) {
		CrmStudentLecture entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = crmStudentLectureService.get(id);
		}
		if (entity == null){
			entity = new CrmStudentLecture();
		}
		return entity;
	}
	
	@RequiresPermissions("student:crmStudentLecture:view")
	@RequestMapping(value = {"list", ""})
	public String list(CrmStudentLecture crmStudentLecture, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CrmStudentLecture> page = crmStudentLectureService.findPage(new Page<CrmStudentLecture>(request, response), crmStudentLecture); 
		model.addAttribute("page", page);
		return "modules/student/crmStudentLectureList";
	}

	@RequiresPermissions("student:crmStudentLecture:view")
	@RequestMapping(value = "form")
	public String form(CrmStudentLecture crmStudentLecture, Model model) {
		model.addAttribute("crmStudentLecture", crmStudentLecture);
		return "modules/student/crmStudentLectureForm";
	}

	@RequiresPermissions("student:crmStudentLecture:edit")
	@RequestMapping(value = "save")
	public String save(CrmStudentLecture crmStudentLecture, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, crmStudentLecture)){
			return form(crmStudentLecture, model);
		}
		crmStudentLectureService.save(crmStudentLecture);
		addMessage(redirectAttributes, "保存学员演讲管理成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmStudentLecture/?repage";
	}
	
	@RequiresPermissions("student:crmStudentLecture:edit")
	@RequestMapping(value = "delete")
	public String delete(CrmStudentLecture crmStudentLecture, RedirectAttributes redirectAttributes) {
		crmStudentLectureService.delete(crmStudentLecture);
		addMessage(redirectAttributes, "删除学员演讲管理成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmStudentLecture/?repage";
	}

}