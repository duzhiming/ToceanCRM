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
import com.thinkgem.jeesite.modules.student.entity.CrmClasses;
import com.thinkgem.jeesite.modules.student.service.CrmClassesService;

/**
 * 课室信息Controller
 * @author duzhiming
 * @version 2017-11-02
 */
@Controller
@RequestMapping(value = "${adminPath}/student/crmClasses")
public class CrmClassesController extends BaseController {

	@Autowired
	private CrmClassesService crmClassesService;
	
	@ModelAttribute
	public CrmClasses get(@RequestParam(required=false) String id) {
		CrmClasses entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = crmClassesService.get(id);
		}
		if (entity == null){
			entity = new CrmClasses();
		}
		return entity;
	}
	
	@RequiresPermissions("student:crmClasses:view")
	@RequestMapping(value = {"list", ""})
	public String list(CrmClasses crmClasses, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CrmClasses> page = crmClassesService.findPage(new Page<CrmClasses>(request, response), crmClasses); 
		model.addAttribute("page", page);
		return "modules/student/crmClassesList";
	}

	@RequiresPermissions("student:crmClasses:view")
	@RequestMapping(value = "form")
	public String form(CrmClasses crmClasses, Model model) {
		model.addAttribute("crmClasses", crmClasses);
		return "modules/student/crmClassesForm";
	}

	@RequiresPermissions("student:crmClasses:edit")
	@RequestMapping(value = "save")
	public String save(CrmClasses crmClasses, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, crmClasses)){
			return form(crmClasses, model);
		}
		crmClassesService.save(crmClasses);
		addMessage(redirectAttributes, "保存课室信息成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmClasses/?repage";
	}
	
	@RequiresPermissions("student:crmClasses:edit")
	@RequestMapping(value = "delete")
	public String delete(CrmClasses crmClasses, RedirectAttributes redirectAttributes) {
		crmClassesService.delete(crmClasses);
		addMessage(redirectAttributes, "删除课室信息成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmClasses/?repage";
	}

}