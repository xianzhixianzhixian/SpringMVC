<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>起始页面</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath}/test/register.do" method="POST">
			年龄：<input type="text" name="age"/><br>
			生日：<input type="text" name="birthday"/><br>
			<input type="submit" value="注册"/>
		</form>
	</body>
</html>