<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
<%@ taglib prefix="s" uri="/struts-tags" %>


<rapid:override name="head">  
    <title>查看作者所有的作品</title>
</rapid:override>
<rapid:override name="content">
	<%
		String authorname;
		if (session.getAttribute("authorname")!=null){
			authorname = session.getAttribute("authorname").toString();
		}else{
			authorname = "";
		}
	%>
<div class="col-md-9 col-sm-11 table-center table-responsive">
	<h1><%=authorname %>的所有书籍：</h1><br>
	<table class="table table-bordered table-hover ">
		<thead>
			<tr>
				<th>ISBN</th>
				<th>书名</th>
				<th>作者ID</th>
				<th>出版商</th>
				<th>出版日期</th>
				<th>价格</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator  value="books" var="b">
				<tr>
					<td>${b.ISBN}</td>
					<td>${b.title}</td>
					<td>${b.authorID}</td>
					<td>${b.publisher}</td>
					<td>${b.publishDate}</td>
					<td>${b.price}</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</div>
</rapid:override>

<%@include file="../../../base.jsp"%>  