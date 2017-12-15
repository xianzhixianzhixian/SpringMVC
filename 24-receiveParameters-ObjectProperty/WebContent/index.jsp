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
			姓名：<input type="text" name="name"/><br>
			年龄：<input type="age" name="age"/><br>
			学校：<input type="text" name="school.sname"/><br>
			校址：<input type="age" name="school.saddress"/><br>
			<input type="submit" value="注册"/>
		</form>
	</body>
</html>