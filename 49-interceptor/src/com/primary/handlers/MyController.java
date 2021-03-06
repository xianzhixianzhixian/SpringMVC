/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：处理器请求因
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping("test") //命名空间
public class MyController {

	@RequestMapping("/some.do")
	public String doSome() throws Exception {
		System.out.println("执行处理器的doSome()方法");
		
		return "/WEB-INF/jsp/welcome.jsp";
	}
}
