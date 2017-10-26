/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.book.web;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.book.entity.Sort;
import com.thinkgem.jeesite.modules.book.service.SortService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 产品分类Controller
 * @author duzhiming
 * @version 2017-10-25
 */
@Controller
@RequestMapping(value = "${adminPath}/book/sort")
public class SortController extends BaseController {

	@Autowired
	private SortService sortService;
	
	@ModelAttribute
	public Sort get(@RequestParam(required=false) String id) {
		Sort entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = sortService.get(id);
		}
		if (entity == null){
			entity = new Sort();
		}
		return entity;
	}
	
	@RequiresPermissions("book:sort:view")
	@RequestMapping(value = {"list", ""})
	public String list(Sort sort, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Sort> page = sortService.findPage(new Page<Sort>(request, response), sort); 
		model.addAttribute("page", page);
		return "modules/book/sortList";
	}


	@ResponseBody
	@RequestMapping(value = {"listAlljson", ""})
	public List<Sort> listAlljson() {
		List<Sort> list = sortService.findListAll();
		return list;
	}

	@RequiresPermissions("book:sort:view")
	@RequestMapping(value = "form")
	public String form(Sort sort, Model model) {
		model.addAttribute("sort", sort);
		return "modules/book/sortForm";
	}

	@RequiresPermissions("book:sort:edit")
	@RequestMapping(value = "save")
	public String save(Sort sort, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, sort)){
			return form(sort, model);
		}
		sortService.save(sort);
		addMessage(redirectAttributes, "保存产品分类成功");
		return "redirect:"+Global.getAdminPath()+"/book/sort/?repage";
	}
	
	@RequiresPermissions("book:sort:edit")
	@RequestMapping(value = "delete")
	public String delete(Sort sort, RedirectAttributes redirectAttributes) {
		sortService.delete(sort);
		addMessage(redirectAttributes, "删除产品分类成功");
		return "redirect:"+Global.getAdminPath()+"/book/sort/?repage";
	}

}