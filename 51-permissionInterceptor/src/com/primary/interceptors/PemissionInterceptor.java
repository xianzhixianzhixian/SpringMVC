/**
 * 作者：樊钰丰
 * 时间：2017.9.25
 * 功能：权限拦截器
 */

package com.primary.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PemissionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("执行OneInterceptor preHandle()");
		HttpSession session=request.getSession();
		String user=(String)session.getAttribute("user");
		if("作者".equals(user)) {
			return true;
		}
		request.getRequestDispatcher("/fail.jsp").forward(request, response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("执行OneInterceptor postHandle()");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("执行OneInterceptor afterCompletion()");
		
	}

}
