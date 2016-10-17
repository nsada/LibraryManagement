<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>   
<%@ taglib prefix="s" uri="/struts-tags" %>


<rapid:override name="head">  
    <title>查看所有作者</title>
</rapid:override>
<rapid:override name="content">


<div class="col-md-9 col-sm-11 table-center table-responsive">
	<table class="table table-bordered table-hover ">
		<h1>作者列表</h1><br/>
		<thead>
			<tr>
				<th>ID</th>
				<th>姓名</th>
				<th>国籍</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator  value="authors" var="a">
				<tr>
					<td>${a.authorID}</td>
					<td>${a.name}</td>
					<td>${a.country}</td>
					<td>${a.age}</td>
					<td>
						<a href='<s:url action="updateAuthorForm"><s:param name="id" value="#a.authorID"/></s:url>'><input type="button" value="更新"/></a>
					</td>
				</tr>
		</s:iterator>
		</tbody>
	</table>
</div>
</rapid:override>

<%@include file="../../../base.jsp"%>  