/**
 * 作者：樊钰丰
 * 时间：2017.9.19
 * 功能：httpRequestHandlerAdapter的使用,处理器
 * 除了表单和Ajax请求可以指定为POST方法,其它请求均为GET方法
 */

package com.primary.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MyController extends MultiActionController {
	
	public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doFirst()");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doSecond()");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
}
