<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>欢迎页面</title>
	</head>
	<body>
		<!-- 
			param.pname的底层执行的是request.getParameter("pname")
			requestScope.pname的底层是request.getAttribute("pname");
		 -->
		name = ${param.pname }<br>
		age = ${param.page }<br>
	</body>
</html>