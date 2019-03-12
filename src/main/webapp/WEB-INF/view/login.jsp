<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<!-- <html>
<head>
<meta charset="ISO-8859-1">
<title>loginPage</title>
</head>
<body>
	
</body>
</html> -->
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
</head>

<body>
	<form action="login" method="post" id="myform">
		<p>请输入用户名：<input type="text" id="username" name="username" /></p>
		<p>请输入用户密码：<input type="password" id="password" name="password" /> </p>
		<input type="submit" value="提交" id="login" />
	</form>
</body>

</html>
