/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：自定义异常处理器(注解式开发)
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.primary.exceptions.AgeException;
import com.primary.exceptions.NameException;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
public class BaseController {
	
	//处理AgeException异常
	@ExceptionHandler(value = AgeException.class)
	public ModelAndView handleAgeException(Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/ageError.jsp");
		
		return mv;
	}
	
	//处理NameException异常
	@ExceptionHandler(value = NameException.class)
	public ModelAndView handleNameException(Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/nameError.jsp");
		
		return mv;
	}
	
	//处理其它异常
	@ExceptionHandler
	public ModelAndView handleException(Exception ex) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("ex",ex);
		mv.setViewName("/errors/error.jsp");
		
		return mv;
	}
}
