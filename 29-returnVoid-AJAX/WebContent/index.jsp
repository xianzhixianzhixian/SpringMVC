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
						data:{
							name:"作者",
							age:23
						},
						success:function(data){
							var json=eval("("+data+")");
							alert(json.name+"      "+json.age);
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