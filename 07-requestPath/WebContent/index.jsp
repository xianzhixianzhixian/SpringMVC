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
			不带斜杠的访问：其相对路径是当前的访问路径
			访问路径：url去掉资源名剩余部分就是访问路径
			<a href="test/my.do">提交表单</a>
		 -->
		 
		<!-- 
			问题解决：加上项目名称
			EL表达式：
			EL（Expression Language） 是为了使JSP写起来更加简单。表达式语言的灵感来自于 ECMAScript和
			XPath 表达式语言，它提供了在 JSP 中简化表达式的方法，让Jsp的代码更加简化
			
			在这里${pageContext.request.contextPath}得到的路径是http//:localhost:8080/07-requestPath
		 -->
		<a href="${pageContext.request.contextPath}/test/my.do">提交表单</a>
	</body>
</html>