/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：捕获自定义异常
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.primary.exceptions.AgeException;
import com.primary.exceptions.NameException;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public ModelAndView doRegister(String name,int age)
					throws Exception {
		//int i=3/0;
		
		if(!"北京".equals(name)) {
			throw new NameException("用户名输入错误");
		}
		if(age>60) {
			throw new AgeException("年龄输入错误");
		}
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",age);
		mv.addObject("name",name);
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
}
