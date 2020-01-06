package com.humengyuan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.humengyuan.bean.Columnl;
import com.humengyuan.service.ColService;

@Controller
public class TestController {

	@Autowired
	private ColService colservice;

	/**
	 * 修改
	 */
	@RequestMapping("upd")
	public String upd(Columnl col) {
		int i = colservice.upd(col);
		if (i > 0) {
			// 审核成功跳到查询页面
			return "redirect:list";
		} else {
			// 审核失败 跳到修改页面
			return "upd";
		}
	}

	/**
	 * 回显
	 */
	@RequestMapping("showlook")
	public String xian(int cid, Model model) {
		Columnl xian = colservice.xian(cid);
		model.addAttribute("xian", xian);
		return "upd";
	}

	/**
	 * 查询
	 * 
	 * @param col
	 * @param pageNum
	 * @param model
	 * @param cname
	 * @param cmiaos
	 * @param czi
	 * @param start
	 * @param end
	 * @return
	 */
	@RequestMapping("list")
	public String list(Columnl col, @RequestParam(defaultValue = "1") int pageNum, Model model, String cname,
			String cmiaos, String czi, String start, String end, String begina, String enda, String cshangp,
			String cadd) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 模糊查询关键字
		map.put("czi", czi);
		// 公司名称模糊查询
		map.put("cname", cname);
		// 描述查询
		map.put("cmiaos", cmiaos);
		// 地址模糊查询
		map.put("cadd", cadd);
		// 主营产品模糊查询
		map.put("cshangp", cshangp);
		map.put("start", start);
		map.put("end", end);
		map.put("enda", enda);
		map.putIfAbsent("begina", begina);

		PageHelper.startPage(pageNum, 2);
		List<Columnl> list = colservice.list(map);
		PageInfo<Columnl> pp = new PageInfo<Columnl>(list);
		model.addAttribute("pp", pp);
		return "list";
	}
}
