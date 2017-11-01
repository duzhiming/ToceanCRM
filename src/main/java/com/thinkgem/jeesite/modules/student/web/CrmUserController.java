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
import com.thinkgem.jeesite.modules.student.entity.CrmUser;
import com.thinkgem.jeesite.modules.student.service.CrmUserService;

/**
 * 用户信息Controller
 * @author duzhiming
 * @version 2017-11-01
 */
@Controller
@RequestMapping(value = "${adminPath}/student/crmUser")
public class CrmUserController extends BaseController {

	@Autowired
	private CrmUserService crmUserService;
	
	@ModelAttribute
	public CrmUser get(@RequestParam(required=false) String id) {
		CrmUser entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = crmUserService.get(id);
		}
		if (entity == null){
			entity = new CrmUser();
		}
		return entity;
	}
	
	@RequiresPermissions("student:crmUser:view")
	@RequestMapping(value = {"list", ""})
	public String list(CrmUser crmUser, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CrmUser> page = crmUserService.findPage(new Page<CrmUser>(request, response), crmUser); 
		model.addAttribute("page", page);
		return "modules/student/crmUserList";
	}

	@RequiresPermissions("student:crmUser:view")
	@RequestMapping(value = "form")
	public String form(CrmUser crmUser, Model model) {
		model.addAttribute("crmUser", crmUser);
		return "modules/student/crmUserForm";
	}

	@RequiresPermissions("student:crmUser:edit")
	@RequestMapping(value = "save")
	public String save(CrmUser crmUser, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, crmUser)){
			return form(crmUser, model);
		}
		crmUserService.save(crmUser);
		addMessage(redirectAttributes, "保存用户信息成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmUser/?repage";
	}
	
	@RequiresPermissions("student:crmUser:edit")
	@RequestMapping(value = "delete")
	public String delete(CrmUser crmUser, RedirectAttributes redirectAttributes) {
		crmUserService.delete(crmUser);
		addMessage(redirectAttributes, "删除用户信息成功");
		return "redirect:"+Global.getAdminPath()+"/student/crmUser/?repage";
	}

}