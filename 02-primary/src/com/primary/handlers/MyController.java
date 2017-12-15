/**
 * 作者：樊钰丰
 * 时间：2017.9.15
 * 功能：我的第一个SpringMVC项目
 */

package com.primary.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv=new ModelAndView();
		//其底层执行的是request.setAttribute()方法
		mv.addObject("message","hello springMVC");
		mv.setViewName("welcome");
		return mv;
	}

}
