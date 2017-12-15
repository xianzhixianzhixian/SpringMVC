/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：处理器请求因
 */

package com.primary.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/xxx/ooo/jjj"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/my.do","hello.do"}, method = {RequestMethod.GET})
	public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doFirst()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}

	//表示参数里面必须要有name,不能有age   params = {"name=zs"}表示name的值必须为zs
	@RequestMapping(value = {"/second.do"}, params = {"name","!age"})
	public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doSecond()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	@RequestMapping(value = {"/third*.do"}) //资源名称必须以third开头
	public ModelAndView doThird(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doThird()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	@RequestMapping(value = {"/*fourth.do"}) //资源名称必须以fourth结尾
	public ModelAndView doFourth(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doFourth()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	@RequestMapping(value = {"/*/fifth.do"}) //路径级数的绝对匹配,即要求在jjj与fifth.do之间必须要有一级路径
	public ModelAndView doFifth(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doFifth()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
	
	@RequestMapping(value = {"/**/sixth.do"}) //要求在jjj与sixth.do之间可以包含多级路径,也可以没有其它路径
	public ModelAndView doSixth(HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","执行doSixth()方法");
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
}
