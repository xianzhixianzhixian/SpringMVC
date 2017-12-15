/**
 * 作者：樊钰丰
 * 时间：2017.9.20
 * 功能：AbstractController的使用,处理器
 * 除了表单和Ajax请求可以指定为POST方法,其它请求均为GET方法
 */

package com.primary.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","Hello SpringMVC!");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}

}
