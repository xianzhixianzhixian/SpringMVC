/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：校正请求参数名
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public ModelAndView doRegister(@RequestParam(value = "pname") String name,int age)
					throws Exception {
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",age);
		mv.addObject("name",name);
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
}
