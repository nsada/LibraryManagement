<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户</title>
</head>
<body>
	<li id="index"><a href="<%=request.getContextPath()%>">主页</a></li>
	<table width="600" border="1">
			<tr>
				<th>用户名</th>
				<th>密码</th>
			</tr>
		<s:iterator value="users" var="u">
			<tr>
				<td>${u.name}</td>
				<td>${u.password}</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>