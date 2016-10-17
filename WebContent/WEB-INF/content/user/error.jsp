<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	不好意思，登录失败。<br/>
	请<a href="<%=request.getContextPath()%>/user/regist">注册</a><br/>
	或<a href="<%=request.getContextPath()%>/user/login">重新登录</a><br/>
</body>
</html>