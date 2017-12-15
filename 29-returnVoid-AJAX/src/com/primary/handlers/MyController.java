/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：处理器方法返回值void,AJAX技术
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/myajax.do"})
	public void doAjax(String name,int age,HttpServletResponse response)
					throws Exception {
		response.setContentType("text/html;charset=utf-8");
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", name);
		map.put("age", age);
		
		JSONObject myJsonObject=JSONObject.fromObject(map);
		String jsonStr=myJsonObject.toString();
		
		PrintWriter out=response.getWriter();
		out.println(jsonStr);
		out.close();
	}
}
