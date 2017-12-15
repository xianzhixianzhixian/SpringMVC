<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//request.getContextPath()拿到的是你的web项目的根路径,就是WebContent
String path=request.getContextPath();

//http://localhost:8080
String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE>
<!-- 
	作者：樊钰丰
	时间：2017.9.17
	功能：请求路径问题-不带斜杠的相对路径问题的解决方案：basePath
 -->
<html>
	<head>
		<base href="<%=basePath %>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>起始页面</title>
	</head>
	<body>
		<!-- base标签会在当前页面的不以斜杠开头的路径前加上basePath路径,使其变为绝对路径 -->
		<a href="test/my.do">提交表单</a>
	</body>
</html>