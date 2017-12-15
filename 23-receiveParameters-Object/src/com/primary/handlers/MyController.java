/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：以对象形式整体接收表单内容,要求表单参数名与对象属性名相同
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.primary.beans.Student;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/register.do"})
	public ModelAndView doRegister(Student student)
					throws Exception {
		
		System.out.println("name="+student.getName());
		System.out.println("age="+student.getAge());
		
		
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",student.getAge());
		mv.addObject("name",student.getName());
		//"/WEB-INF/jsp/welcome.jsp"最左边的第一个/一定不能少
		mv.setViewName("/WEB-INF/jsp/welcome.jsp"); //设置视图名称
		return mv;
	}
}
