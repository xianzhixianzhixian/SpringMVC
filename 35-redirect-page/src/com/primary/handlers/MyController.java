/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：请求重定向到页面
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public ModelAndView doRegister(String name,int age)
					throws Exception {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("page",age);
		mv.addObject("pname",name);

		mv.setViewName("redirect:/welcome.jsp"); //设置视图名称
		return mv;
	}
}
