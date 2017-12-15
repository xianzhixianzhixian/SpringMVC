/**
 * 作者：樊钰丰
 * 时间：2017.9.19
 * 功能：httpRequestHandlerAdapter的使用,处理器
 * 除了表单和Ajax请求可以指定为POST方法,其它请求均为GET方法
 */

package com.primary.handlers;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class MyController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("message", "Hello SpringMVC!");
		request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp").forward(request, response);
	}
}
