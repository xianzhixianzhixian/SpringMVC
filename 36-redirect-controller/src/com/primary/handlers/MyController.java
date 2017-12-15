/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：捕获异常
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public String doRegister(String name,int age, Model model) {
		model.addAttribute("pname",name);
		model.addAttribute("page",age);
		return "redirect:other.do";
	}
	
	@RequestMapping(value = {"/other.do"})
	public String doOther(String pname,int page) {

		System.out.print(pname+" "+page);
		return "/welcome.jsp"; //不带前缀的默认是redirect
	}
}
