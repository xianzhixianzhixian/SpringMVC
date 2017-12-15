<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>起始页面</title>
	</head>
	<body>
		<!-- 
			这个路径出现在jsp页面，所以是前台路径。
			前台路径的参照路径是：当前Web服务器的根，即http://localhost:8080
			绝对路径=参照路径+相对路径，所以当前超链接所提交的请求的对路径是
			http://localhost:8080/my.do
			<a href="/my.do">访问welcome页面</a>
		 -->
		 
		<!-- 
			这个路径没有以斜杠开头，所以其参照路径是当前的访问路径
			当前的访问路径是：http://localhost:8080/06-requestPath/
			绝对路径=参照路径+相对路径，所以当前超链接所提交的请求的对路径是
			http://localhost:8080/06-requestPath/my.do
		 -->
		<a href="my.do">访问welcome页面</a>
	</body>
</html>