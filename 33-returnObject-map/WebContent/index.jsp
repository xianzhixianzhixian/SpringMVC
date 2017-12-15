<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("button").click(function(){
					$.ajax({
						url:"test/myajax.do",
						success:function(data){
							alert(data.stu1.name+"     "+data.stu2.name+"    "+data.stu3.name);
						}
					});
				});
			});
		</script>
		<title>起始页面</title>
	</head>
	<body>
		<button>提交AJAX请求</button>
	</body>
</html>