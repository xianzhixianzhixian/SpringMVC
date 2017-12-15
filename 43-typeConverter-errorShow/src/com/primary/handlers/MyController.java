/**
 * 作者：樊钰丰
 * 时间：2017.9.23
 * 功能：表单数据填写不符合格式时返回初始页面,带原有数据和错误提示信息
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
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
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	//数据回显
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView typeMismatchExceptionResolver(HttpServletRequest request,Exception ex) {
		ModelAndView mv=new ModelAndView();
		
		String age=request.getParameter("age");
		String birthday=request.getParameter("birthday");
		
		//捕获到的异常信息
		String exMSG=ex.getMessage();
		if(exMSG.contains(age)) {
			mv.addObject("ageErrors", "年龄格式错误");
		}
		if(exMSG.contains(birthday)) {
			mv.addObject("birthdayErrors", "日期格式错误");
		}
		
		mv.addObject("age", age);
		mv.addObject("birthday", birthday);
		mv.setViewName("/index.jsp"); //设置视图名称
		return mv;
	}
	
}
