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
import com.thinkgem.jeesite.modules.student.entity.StuPraise;
import com.thinkgem.jeesite.modules.student.service.StuPraiseService;

/**
 * 表扬管理Controller
 * @author duzhiming
 * @version 2017-10-30
 */
@Controller
@RequestMapping(value = "${adminPath}/student/stuPraise")
public class StuPraiseController extends BaseController {

	@Autowired
	private StuPraiseService stuPraiseService;
	
	@ModelAttribute
	public StuPraise get(@RequestParam(required=false) String id) {
		StuPraise entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = stuPraiseService.get(id);
		}
		if (entity == null){
			entity = new StuPraise();
		}
		return entity;
	}
	
	@RequiresPermissions("student:stuPraise:view")
	@RequestMapping(value = {"list", ""})
	public String list(StuPraise stuPraise, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<StuPraise> page = stuPraiseService.findPage(new Page<StuPraise>(request, response), stuPraise); 
		model.addAttribute("page", page);
		return "modules/student/stuPraiseList";
	}

	@RequiresPermissions("student:stuPraise:view")
	@RequestMapping(value = "form")
	public String form(StuPraise stuPraise, Model model) {
		model.addAttribute("stuPraise", stuPraise);
		return "modules/student/stuPraiseForm";
	}

	@RequiresPermissions("student:stuPraise:edit")
	@RequestMapping(value = "save")
	public String save(StuPraise stuPraise, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, stuPraise)){
			return form(stuPraise, model);
		}
		stuPraiseService.save(stuPraise);
		addMessage(redirectAttributes, "保存表扬成功");
		return "redirect:"+Global.getAdminPath()+"/student/stuPraise/?repage";
	}
	
	@RequiresPermissions("student:stuPraise:edit")
	@RequestMapping(value = "delete")
	public String delete(StuPraise stuPraise, RedirectAttributes redirectAttributes) {
		stuPraiseService.delete(stuPraise);
		addMessage(redirectAttributes, "删除表扬成功");
		return "redirect:"+Global.getAdminPath()+"/student/stuPraise/?repage";
	}

}