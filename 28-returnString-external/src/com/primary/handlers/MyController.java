/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：处理器方法的返回值-String-外部资源视图名
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/some.do"})
	public String doSome() {
		//视图对象名称
		return "taobao";
	}
}
