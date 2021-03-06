/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：处理器方法返回值Object,String
 * 需要限定字符集
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = "/myajax.do", produces = "text/html;charset=utf-8")
	@ResponseBody //将返回的数据放入到响应体中
	public Object doAjax() throws Exception {
		return "China北京";
	}
}
