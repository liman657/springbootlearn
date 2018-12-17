<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试JSR-303</title>
<!-- 加载Query文件-->
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// 请求验证的POJO
		var pojo = {
			id : 1,
			date : '2019-08-08',
			doubleValue : 999.09,
			integer : 80,
			range : 80,
			email : '657271181@qq.com',
			size : '25liamnataoimdoasgasld',
			regexp : 'a,b,c,d'
		}
		$.post({
			url : "./validate",
			// 此处需要告知传递参数类型为JSON，不能缺少
			contentType : "application/json",
			// 将JSON转化为字符串传递
			data : JSON.stringify(pojo),
			// 成功后的方法
			success : function(result) {
			    alert(result.date);
			}
		});
	});
</script>
</head>
<body></body>
</html>