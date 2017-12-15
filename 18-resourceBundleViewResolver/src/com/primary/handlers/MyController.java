/**
 * 作者：樊钰丰
 * 时间：2017.9.20
 * 功能：视图解析器
 */

package com.primary.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//return new ModelAndView("taobao");
		return new ModelAndView("internalResource");
	}

}
