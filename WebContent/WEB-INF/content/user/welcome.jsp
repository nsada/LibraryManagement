<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
	${sessionScope.username},恭喜你登陆成功！
	<a href="viewAllUsers">查看系统中所有用户</a>
	<li id="index"><a href="<%=request.getContextPath()%>/index">主页</a></li>
</body>
</html>