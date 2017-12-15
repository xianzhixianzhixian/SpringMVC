/**
 * 作者：樊钰丰
 * 时间：2017.9.23
 * 功能：初始化参数绑定,适应多种日期格式
 */

package com.primary.handlers;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.primary.editors.MyDateEditor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public ModelAndView doRegister(int age, Date birthday)
					throws Exception {
		
		System.out.println("birthday="+birthday);
		System.out.println("age="+age);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",age);
		mv.addObject("birthday",birthday);
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	@InitBinder
	public void ininBinder(WebDataBinder binder) {
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		//CustomDateEditor日期编辑器
		binder.registerCustomEditor(Date.class, new MyDateEditor());
	}
}
