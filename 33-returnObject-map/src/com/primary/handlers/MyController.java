/**
 * 作者：樊钰丰
 * 时间：2017.9.22
 * 功能：返回自定义类型的数据
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.primary.beans.Student;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/myajax.do"})
	@ResponseBody //将返回的数据放入到响应体中
	public Object doAjax() throws Exception {
		Map<String, Student> map=new HashMap<String,Student>();
		map.put("stu1", new Student("作者",23));
		map.put("stu2", new Student("泰坦",23));
		map.put("stu3", new Student("搜索",23));
		
		return map;
	}
}
