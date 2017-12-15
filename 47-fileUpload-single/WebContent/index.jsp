<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<!-- 这里content必须为multipart/form-data -->
		<meta http-equiv="Content-Type" content="multipart/form-data"  charset="UTF-8">
		<title>起始页面</title>
	</head>
	
	<body>
		<form action="${pageContext.request.contextPath}/test/upload.do" method="POST" enctype="multipart/form-data">
			文件：<input type="file" name="img"/><br>
			<input type="submit" value="上传"/>
		</form>
	</body>
</html>